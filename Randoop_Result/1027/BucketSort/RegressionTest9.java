package BucketSort;

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
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        int[] intArray5 = new int[] { (short) -1, 1, 35, 35, 1 };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 35, 35, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        int[] intArray5 = new int[] { (short) -1, 1, 35, 35, 1 };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 35, 35, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        int[] intArray6 = new int[] { 0, '4', '4', '4', '4', 1 };
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int19 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int21 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int22 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 52, 52, 52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        int[] intArray6 = new int[] { 0, '4', '4', '4', '4', 1 };
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 52, 52, 52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        java.lang.Class<?> wildcardClass16 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int19 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        int[] intArray3 = new int[] { 1, 1, (short) 100 };
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int20 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int21 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int22 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int23 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int24 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        java.lang.Class<?> wildcardClass18 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        int[] intArray6 = new int[] { 0, '4', '4', '4', '4', 1 };
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 52, 52, 52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        int[] intArray5 = new int[] { (short) -1, 1, 35, 35, 1 };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        java.lang.Class<?> wildcardClass19 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 35, 35, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        int[] intArray6 = new int[] { 0, '4', '4', '4', '4', 1 };
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 52, 52, 52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int21 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int22 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        int[] intArray6 = new int[] { 0, '4', '4', '4', '4', 1 };
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int19 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int21 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 52, 52, 52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        java.lang.Class<?> wildcardClass17 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int21 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int22 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int23 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int20 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int21 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int22 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int23 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        int[] intArray6 = new int[] { 0, '4', '4', '4', '4', 1 };
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 52, 52, 52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        int[] intArray6 = new int[] { 0, '4', '4', '4', '4', 1 };
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 52, 52, 52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int19 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int20 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int21 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int22 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int23 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int24 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int19 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int21 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int22 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int23 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int21 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int22 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int23 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int24 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int25 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        java.lang.Class<?> wildcardClass21 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        int[] intArray6 = new int[] { 0, '4', '4', '4', '4', 1 };
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 52, 52, 52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int20 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        int[] intArray6 = new int[] { 0, '4', '4', '4', '4', 1 };
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int19 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int20 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int21 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int22 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 52, 52, 52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int21 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int22 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int23 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        int[] intArray3 = new int[] { 'a', 0, 0 };
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int21 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int22 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int23 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int24 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int25 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        java.lang.Class<?> wildcardClass26 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int19 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int21 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int22 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int23 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        java.lang.Class<?> wildcardClass24 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        int[] intArray3 = new int[] { 1, 1, (short) 100 };
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        int[] intArray6 = new int[] { 0, '4', '4', '4', '4', 1 };
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 52, 52, 52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        int[] intArray3 = new int[] { 1, 1, (short) 100 };
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        int[] intArray6 = new int[] { 0, '4', '4', '4', '4', 1 };
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int19 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int21 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 52, 52, 52, 52, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int21 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int22 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        int[] intArray5 = new int[] { 0, (byte) 10, ' ', '4', '#' };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int21 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 32, 52, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        int[] intArray5 = new int[] { (short) -1, 1, 35, 35, 1 };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 35, 35, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        int[] intArray6 = new int[] { 52, (byte) 100, '4', (short) 0, (byte) 10, (short) 0 };
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray6);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 100, 52, 0, 10, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int21 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int22 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int23 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        int[] intArray3 = new int[] { 1, 1, (short) 100 };
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray3);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int19 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        int[] intArray5 = new int[] { (short) -1, 1, 35, 35, 1 };
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int8 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray5);
        int int13 = com.thealgorithms.sorts.BucketSort.min(intArray5);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 35, 35, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int15 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int16 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int17 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int18 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int19 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int20 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int12 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int13 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int14 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        int[] intArray2 = new int[] { (byte) 10, (short) -1 };
        int int3 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int4 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int5 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int6 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int7 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int8 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        int int9 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int10 = com.thealgorithms.sorts.BucketSort.max(intArray2);
        int int11 = com.thealgorithms.sorts.BucketSort.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }
}

