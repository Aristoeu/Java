package CoinChange;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 42);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 16);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 100);
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
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 49);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 17);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2147483647);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
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
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 12);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 162);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int29 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 30);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 47 + "'", int19 == 47);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 100);
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
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 130);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28 + "'", int18 == 28);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 20);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 6);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 130);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 162 + "'", int21 == 162);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass22 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 46);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 114);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 5);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36 + "'", int16 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 46 + "'", int19 == 46);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 15);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 55);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 39);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
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
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 48);
        int int29 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        java.lang.Class<?> wildcardClass30 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 54);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
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
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 51);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 42);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50 + "'", int23 == 50);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 97);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 39);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 47 + "'", int23 == 47);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 51 + "'", int28 == 51);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 50);
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
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 51 + "'", int25 == 51);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 99);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 99);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 46 + "'", int20 == 46);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
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
        java.lang.Class<?> wildcardClass22 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 19);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
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
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 39);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 6);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 53);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 51);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 41);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
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
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50 + "'", int23 == 50);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 18);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 38);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 114);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 5);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 29);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 5);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        java.lang.Class<?> wildcardClass22 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 9);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 102);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 106 + "'", int22 == 106);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 106);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 35);
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
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 28);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 28 + "'", int17 == 28);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 34 + "'", int22 == 34);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 41);
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
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 97);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50 + "'", int17 == 50);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 130);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 29);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 41);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 47 + "'", int26 == 47);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 40);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 41);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 9);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
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
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 29);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 53);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 19);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 162);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
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
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 130);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
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
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 38);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 19);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 32);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) 'a');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 18);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 18 + "'", int26 == 18);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int29 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 49 + "'", int27 == 49);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 17 + "'", int17 == 17);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 41);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 41 + "'", int18 == 41);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 37);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 162);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 63 + "'", int18 == 63);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 11);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 50);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 15);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 31);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
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
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 50);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 32);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 37);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 34 + "'", int19 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
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
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 30);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 14);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 12);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 17 + "'", int14 == 17);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 32);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33 + "'", int16 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 15);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 46 + "'", int25 == 46);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 47 + "'", int22 == 47);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 47 + "'", int16 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 46);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 54);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 54);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 46 + "'", int11 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
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
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 51);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
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
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
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
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 17);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 18);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 63);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 100);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 13 + "'", int17 == 13);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 106);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 35);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36 + "'", int16 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12 + "'", int25 == 12);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 40);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 40 + "'", int21 == 40);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 47 + "'", int16 == 47);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int30 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 63);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 28);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
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
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
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
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 38);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 38 + "'", int26 == 38);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 55);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
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
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 55);
        int int30 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 106);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 50);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 9);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
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
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 52);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 40);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 41);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 15);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 130);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 46 + "'", int11 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 28 + "'", int14 == 28);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 35);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 39);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 52);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 32);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 63);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 100);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 36);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 37 + "'", int19 == 37);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 9);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 42);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
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
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 63);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 12 + "'", int26 == 12);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 14);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 34 + "'", int20 == 34);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 14 + "'", int26 == 14);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 98);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 64);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 65 + "'", int23 == 65);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 47 + "'", int16 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 47 + "'", int21 == 47);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 15);
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
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
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
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 34 + "'", int17 == 34);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 15);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 13);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 16);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
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
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
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
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 55);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 20);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 34);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 18);
        int int29 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 51 + "'", int29 == 51);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 30);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 32);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 18);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 98);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 99);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 29);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
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
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 50);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 32);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 63);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 46 + "'", int13 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 49);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 51);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 13);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 14 + "'", int22 == 14);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50 + "'", int17 == 50);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (-1));
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
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
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '#');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 8);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
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
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 64);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '4');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 52);
        java.lang.Class<?> wildcardClass21 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53 + "'", int20 == 53);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
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
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) -1);
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
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 54);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 47 + "'", int19 == 47);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 6);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 100);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 50);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 29);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 46 + "'", int16 == 46);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 12);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 49);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50 + "'", int17 == 50);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 7);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
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
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 6);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
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
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37 + "'", int20 == 37);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
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
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 46 + "'", int11 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 51);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 15);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 46 + "'", int13 == 46);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 41);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 41 + "'", int15 == 41);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 17);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 49);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 18 + "'", int7 == 18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
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
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 46 + "'", int16 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 1);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 35);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 114);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 130 + "'", int19 == 130);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 18);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 12);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 17);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 17 + "'", int25 == 17);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
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
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 19);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 5);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 130);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 47);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 19);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 15);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 50);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 50);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 34);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 38);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
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
        java.lang.Class<?> wildcardClass26 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 39);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 46);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 52);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 106);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 114 + "'", int12 == 114);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 7);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 49 + "'", int25 == 49);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 35);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
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
        int int29 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 12);
        int int31 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 28);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 55);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
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
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 19);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 40);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 9);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 35);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass24 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 28);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
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
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 13);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 114);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 130 + "'", int18 == 130);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 14);
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
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }
}

