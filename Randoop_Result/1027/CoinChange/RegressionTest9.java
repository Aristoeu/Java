package CoinChange;

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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
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
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        java.lang.Class<?> wildcardClass24 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 97);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 97);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 19);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 32);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) 'a');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 39);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (-1));
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 13);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 14 + "'", int23 == 14);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
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
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 37 + "'", int19 == 37);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 97);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2147483647);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 18);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 40);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 18 + "'", int19 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 40 + "'", int21 == 40);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
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
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 97);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
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
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 35);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 35);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        int[] intArray6 = new int[] { (byte) 100, 1, 35, 49, 11, 100 };
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray6, (int) '#');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray6, 114);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 35, 49, 11, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 38);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 99);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 31);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 29);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 29 + "'", int23 == 29);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
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
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 55);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 130);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 50 + "'", int21 == 50);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 16);
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
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 46 + "'", int9 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 19);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 55);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 19);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 98);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 17);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
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
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 13);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 41);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 13 + "'", int26 == 13);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 7);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 100);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 32);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
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
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
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
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 7);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 39);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 46);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 40 + "'", int19 == 40);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
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
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 42);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37 + "'", int18 == 37);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 15);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50 + "'", int23 == 50);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 19);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33 + "'", int21 == 33);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 13);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 19);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
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
        int int29 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 50 + "'", int29 == 50);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 2);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
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
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
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
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int31 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 53);
        int int33 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 49 + "'", int28 == 49);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 14);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 14 + "'", int20 == 14);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 55);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 34 + "'", int20 == 34);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 106);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 40);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 29);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 39);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 55);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 99);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 29);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 15);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 47 + "'", int13 == 47);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 53);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 53);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 46 + "'", int23 == 46);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
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
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
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
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 32);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 97);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '4');
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 38);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 32);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 38 + "'", int23 == 38);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 33 + "'", int26 == 33);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 99);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 55);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 40);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 30);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 40);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 47 + "'", int20 == 47);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
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
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2147483647);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
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
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 47 + "'", int24 == 47);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 6);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 106);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 50);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 42);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 29);
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
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 99);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
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
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
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
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        int[] intArray1 = new int[] { 97 };
        int int3 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (short) 100);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 10);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 46);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 6);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 39);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 5);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 5);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
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
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 54);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 39);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 99);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 53);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 29);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
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
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 49);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        int[] intArray4 = new int[] { 0, 36, 2, '#' };
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray4, 11);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray4, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray4);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 36, 2, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
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
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
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
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 114);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 31);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2147483647);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 48);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 37);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 20);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 17);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 33 + "'", int25 == 33);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 28);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 28 + "'", int17 == 28);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 36);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
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
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 29);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 106);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
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
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 41);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 29);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 40);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 114);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 50);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 15);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 50);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
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
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17 + "'", int26 == 17);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 55);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 130);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 28 + "'", int16 == 28);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 50);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 47);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 47 + "'", int16 == 47);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 38);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 38 + "'", int19 == 38);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 19);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 32);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) 'a');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 34 + "'", int17 == 34);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '#');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 54);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 55 + "'", int20 == 55);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 6);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 46 + "'", int22 == 46);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 19);
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
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 106);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
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
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 40);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 3);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 42);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 19);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 19);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 47 + "'", int16 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
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
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36 + "'", int19 == 36);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 38);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 35);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
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
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 49);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49 + "'", int24 == 49);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 106);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 40);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 20);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 106);
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
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 53);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 53);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 106);
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
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 17);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17 + "'", int21 == 17);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 29);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
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
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 41);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 20);
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
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 130);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 99);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
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
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
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
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
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
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
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
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 30);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '#');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
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
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
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
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 15);
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
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        int[] intArray4 = new int[] { 0, 36, 2, '#' };
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray4, 11);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray4, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray4, 9);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray4, 52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 36, 2, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 98);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 36);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 34 + "'", int19 == 34);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 16);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36 + "'", int20 == 36);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 37);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 18);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 15);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 17);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 18);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 47 + "'", int21 == 47);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 12);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 51);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
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
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 7);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 100);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 8);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
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
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
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
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 9);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
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
        int int29 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int31 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int33 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 13);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 46 + "'", int20 == 46);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 40);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 53);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 46 + "'", int16 == 46);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2147483647);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 46 + "'", int25 == 46);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 55);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 38);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 11);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 130);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 162 + "'", int23 == 162);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2147483647);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
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
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 46 + "'", int11 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 106);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 40);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 46 + "'", int19 == 46);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
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
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 102);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 30);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 41);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 41 + "'", int19 == 41);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
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
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 47 + "'", int22 == 47);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 38);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
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
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
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
        int int30 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 36 + "'", int30 == 36);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 31);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 29);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (-1));
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
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
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
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 31);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 55);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 37);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 53);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 55);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 98);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 33 + "'", int22 == 33);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 46 + "'", int26 == 46);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
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
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 99);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 37 + "'", int19 == 37);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 2);
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
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 14);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 14 + "'", int25 == 14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 15);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 15);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16 + "'", int25 == 16);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
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
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 130);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 38);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 15);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 98);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 41);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 47 + "'", int16 == 47);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

