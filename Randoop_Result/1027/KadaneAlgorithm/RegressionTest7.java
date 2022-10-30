package KadaneAlgorithm;

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
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 100);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '4');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, 10);
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (int) (byte) 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 100);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) -1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 1);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 100);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (short) 10);
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 10);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 10);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 10);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 0);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) -1);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) -1);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        java.lang.Class<?> wildcardClass31 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        int[] intArray2 = new int[] { (byte) 1, '4' };
        boolean boolean4 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (int) (short) 1);
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (int) ' ');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (int) '4');
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 52]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 10);
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (short) 1);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (short) 100);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (byte) 100);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 100);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 100);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 10);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) -1);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 1);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 10);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 10);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 100);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 10);
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 1);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (byte) 0);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (-1));
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) -1);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 10);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass31 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 100);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) -1);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 100);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (-1));
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) -1);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) -1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '4');
        boolean boolean23 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) -1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 10);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 10);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 1);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 10);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 10);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '#');
        boolean boolean27 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (-1));
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 100);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        boolean boolean4 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (int) (short) 100);
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, 1);
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (-1));
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (int) (byte) -1);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (-1));
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 10);
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 1);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (byte) 10);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) '4');
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (byte) -1);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (byte) 100);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) 'a');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 10);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 1);
        java.lang.Class<?> wildcardClass20 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) -1);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) -1);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 1);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 10);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '#');
        boolean boolean29 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 10);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '4');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '#');
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 10);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 1);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '#');
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean23 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean25 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 0);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean29 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) -1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        int[] intArray1 = new int[] { 0 };
        boolean boolean3 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 10);
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (short) 1);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (byte) 0);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (byte) -1);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) ' ');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) -1);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) 'a');
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '4');
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) '#');
        boolean boolean23 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean25 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 1);
        boolean boolean27 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) -1);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 100);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 1);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (-1));
        boolean boolean28 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 10);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) -1);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) -1);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '4');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean28 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 10);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 1);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 1);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 0);
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 1);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) ' ');
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 0);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean23 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 10);
        boolean boolean25 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) -1);
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) -1);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (short) 1);
        boolean boolean19 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean21 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        int[] intArray3 = new int[] { (byte) 100, (byte) 10, (short) 0 };
        boolean boolean5 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean7 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 100);
        boolean boolean9 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, 0);
        boolean boolean11 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) ' ');
        boolean boolean13 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (-1));
        boolean boolean15 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 0);
        boolean boolean17 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        boolean boolean6 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean8 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean10 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 0);
        boolean boolean12 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 0);
        boolean boolean14 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean16 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) 100);
        boolean boolean18 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean20 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) '#');
        boolean boolean22 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, 10);
        boolean boolean24 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean26 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean28 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (short) -1);
        boolean boolean30 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) (byte) 100);
        boolean boolean32 = com.thealgorithms.dynamicprogramming.KadaneAlgorithm.max_Sum(intArray4, (int) 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }
}

