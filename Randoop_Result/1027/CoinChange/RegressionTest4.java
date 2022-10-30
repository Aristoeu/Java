package CoinChange;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 4);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 52);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 32);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 17);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 4);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
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
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 106);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 46 + "'", int13 == 46);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
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
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        int int29 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 47 + "'", int27 == 47);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int[] intArray1 = new int[] { 97 };
        int int3 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (short) 100);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 10);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 4);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 3);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 106);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 38);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 35);
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
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 49 + "'", int25 == 49);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 34 + "'", int21 == 34);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 48);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 49);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int[] intArray1 = new int[] { 97 };
        int int3 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (short) 100);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 6);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 9);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 34 + "'", int21 == 34);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 16);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        int[] intArray1 = new int[] { 97 };
        int int3 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (short) 100);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, 17);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 46 + "'", int10 == 46);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 18);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 18 + "'", int12 == 18);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 32);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) 'a');
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2147483647);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 99);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
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
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
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
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        java.lang.Class<?> wildcardClass22 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 99);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 35);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
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
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 3);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        java.lang.Class<?> wildcardClass21 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
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
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 99);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 99);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
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
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        int[] intArray6 = new int[] { 10, (short) -1, (-1), (byte) 10, '#', (short) 1 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, -1, 10, 35, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
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
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 17 + "'", int14 == 17);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
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
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36 + "'", int19 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        int[] intArray6 = new int[] { (byte) 100, 1, 35, 49, 11, 100 };
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray6, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray6, 2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray6, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray6, 34);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1, 35, 49, 11, 100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
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
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) 'a');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 11);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 17);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 114);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 50);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 46 + "'", int16 == 46);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 9);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 99);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 34 + "'", int21 == 34);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 9);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        java.lang.Class<?> wildcardClass22 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37 + "'", int12 == 37);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        java.lang.Class<?> wildcardClass22 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36 + "'", int19 == 36);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 6);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 47 + "'", int19 == 47);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
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
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 46 + "'", int16 == 46);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 9);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 106);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
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
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 53);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 97);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 3);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 5);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 11);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 49);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
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
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 99);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
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
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
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
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 6);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 97);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36 + "'", int16 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
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
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (-1));
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
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
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 11);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 18);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 38);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
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
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 9);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 47 + "'", int17 == 47);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
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
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
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
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 34 + "'", int21 == 34);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 38);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 39 + "'", int14 == 39);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
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
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 6);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 9);
        java.lang.Class<?> wildcardClass21 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 114);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 38);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        int[] intArray6 = new int[] { 10, (short) -1, (-1), (byte) 10, '#', (short) 1 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray6, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray6, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray6, 99);
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
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36 + "'", int22 == 36);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 46 + "'", int25 == 46);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 17);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (-1));
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
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        int[] intArray6 = new int[] { 10, (short) -1, (-1), (byte) 10, '#', (short) 1 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray6, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, -1, 10, 35, 1]");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
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
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 52);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 48);
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
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 5);
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
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
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
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 47 + "'", int20 == 47);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        int[] intArray1 = new int[] { 97 };
        int int3 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray1);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 5);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 47 + "'", int20 == 47);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '#');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 32);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 16);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33 + "'", int13 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 46 + "'", int11 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 48);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        int[] intArray1 = new int[] { 97 };
        int int3 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (short) 100);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, 17);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 12);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 47);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 97);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 99);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37 + "'", int20 == 37);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 114);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
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
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        int[] intArray6 = new int[] { 10, (short) -1, (-1), (byte) 10, '#', (short) 1 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, -1, 10, 35, 1]");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 99);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 18);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
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
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
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
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 5);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
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
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 51);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 102);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 13);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
    }
}

