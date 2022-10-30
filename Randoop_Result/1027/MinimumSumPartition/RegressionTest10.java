package MinimumSumPartition;

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
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-543));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-552));
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-647) + "'", int14 == (-647));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-656) + "'", int18 == (-656));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-520));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-935));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-739));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-297));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-401) + "'", int10 == (-401));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-19));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-300));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-313) + "'", int9 == (-313));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-123) + "'", int11 == (-123));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-404) + "'", int13 == (-404));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-19));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-20));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-935));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-313));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-271));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-111));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-417) + "'", int12 == (-417));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-375) + "'", int14 == (-375));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-215) + "'", int16 == (-215));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-297));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-603));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-221));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-401) + "'", int10 == (-401));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-707) + "'", int13 == (-707));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-104) + "'", int18 == (-104));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-325) + "'", int20 == (-325));
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-289));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-94));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-373));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-477) + "'", int11 == (-477));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-52));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-19));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-27));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-4));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-212));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-625));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-103) + "'", int9 == (-103));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-316) + "'", int13 == (-316));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-729) + "'", int16 == (-729));
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-167));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-439));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-83));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-795));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-271) + "'", int9 == (-271));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-543) + "'", int11 == (-543));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-187) + "'", int13 == (-187));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-899) + "'", int15 == (-899));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-105));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-91));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-1583));
        java.lang.Class<?> wildcardClass16 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-111) + "'", int13 == (-111));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1603) + "'", int15 == (-1603));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 80);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-208));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-380));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-24) + "'", int7 == (-24));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-312) + "'", int9 == (-312));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-484) + "'", int14 == (-484));
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-176));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-11));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-207));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-280) + "'", int12 == (-280));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-115) + "'", int14 == (-115));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-311) + "'", int17 == (-311));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53 + "'", int20 == 53);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-487));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-61));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-165) + "'", int11 == (-165));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-104) + "'", int14 == (-104));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-7));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-111) + "'", int11 == (-111));
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-403));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-572));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-507) + "'", int10 == (-507));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-676) + "'", int13 == (-676));
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-484));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-165));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-980));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-588) + "'", int14 == (-588));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-269) + "'", int16 == (-269));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1084) + "'", int18 == (-1084));
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-333));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-105));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-1225));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-104) + "'", int13 == (-104));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-209) + "'", int15 == (-209));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1329) + "'", int18 == (-1329));
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-477));
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-209));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-259));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-325));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-957));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-19) + "'", int10 == (-19));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-977) + "'", int13 == (-977));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, 1);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-64));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-63) + "'", int8 == (-63));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 43 + "'", int10 == 43);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-128) + "'", int12 == (-128));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-64) + "'", int16 == (-64));
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1479));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-215));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-125) + "'", int11 == (-125));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-319) + "'", int16 == (-319));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 33);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-128));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-356));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-341));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-71) + "'", int10 == (-71));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-232) + "'", int12 == (-232));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-61) + "'", int14 == (-61));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-460) + "'", int16 == (-460));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-445) + "'", int18 == (-445));
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-208));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-4));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-125));
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-312) + "'", int15 == (-312));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-108) + "'", int17 == (-108));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-229) + "'", int20 == (-229));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-52));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-269));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-167));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-215));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-477));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-581) + "'", int13 == (-581));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-61));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-44));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-165) + "'", int11 == (-165));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-104) + "'", int14 == (-104));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-148) + "'", int16 == (-148));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-124));
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-167) + "'", int11 == (-167));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-61));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-44));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-165) + "'", int11 == (-165));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-104) + "'", int14 == (-104));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-148) + "'", int16 == (-148));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53 + "'", int20 == 53);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-445));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-131));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-313) + "'", int9 == (-313));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-549) + "'", int13 == (-549));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-235) + "'", int15 == (-235));
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) -1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-125));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-592));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-143));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-219));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-175));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-323) + "'", int13 == (-323));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-279) + "'", int15 == (-279));
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-104) + "'", int14 == (-104));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 80);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-208));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-53));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-351));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-24) + "'", int7 == (-24));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-312) + "'", int9 == (-312));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-157) + "'", int12 == (-157));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-455) + "'", int17 == (-455));
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-21));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-220));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-175));
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-625));
        int int22 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-312));
        int int23 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 51);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-313));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-735));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-19));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-417));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-313) + "'", int9 == (-313));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-123) + "'", int11 == (-123));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-521) + "'", int14 == (-521));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-439));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-839));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-543) + "'", int15 == (-543));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-943) + "'", int17 == (-943));
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-24));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, 15);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-375));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass18 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-44) + "'", int10 == (-44));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5) + "'", int14 == (-5));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-395) + "'", int16 == (-395));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-72));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-24));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-335));
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-176) + "'", int12 == (-176));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-128) + "'", int15 == (-128));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-167) + "'", int17 == (-167));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-439) + "'", int19 == (-439));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-71));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-7));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-1145));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-175) + "'", int11 == (-175));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-104) + "'", int17 == (-104));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1249) + "'", int20 == (-1249));
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-125));
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-24));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-167) + "'", int11 == (-167));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-104) + "'", int14 == (-104));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-229) + "'", int17 == (-229));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-128) + "'", int19 == (-128));
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-440));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-339));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-63));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-52));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-111));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-195));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-131));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-277));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-19) + "'", int10 == (-19));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-297) + "'", int14 == (-297));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 100);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-373));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-956));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-477) + "'", int11 == (-477));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1060) + "'", int15 == (-1060));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) 'a');
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-64));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-7) + "'", int10 == (-7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-168) + "'", int13 == (-168));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1141));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-72));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-24));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-7));
        int int26 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-915));
        int int27 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int29 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-531));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-176) + "'", int12 == (-176));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-128) + "'", int15 == (-128));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-167) + "'", int17 == (-167));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 51 + "'", int22 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-111) + "'", int24 == (-111));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1019) + "'", int26 == (-1019));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 51 + "'", int27 == 51);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-635) + "'", int29 == (-635));
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-229));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int23 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-833));
        int int25 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-939));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-269));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 53);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-356));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-588));
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-416));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520) + "'", int12 == (-520));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-269));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        java.lang.Class<?> wildcardClass16 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-333) + "'", int11 == (-333));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-64) + "'", int13 == (-64));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 43 + "'", int14 == 43);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-104));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-312));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-105));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-208) + "'", int10 == (-208));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-416) + "'", int13 == (-416));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-209) + "'", int16 == (-209));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 100);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-103) + "'", int16 == (-103));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53 + "'", int20 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-832));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-769));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-94) + "'", int11 == (-94));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-936) + "'", int13 == (-936));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-873) + "'", int15 == (-873));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-939));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-1039));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-277));
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1043) + "'", int14 == (-1043));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1143) + "'", int16 == (-1143));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-381) + "'", int18 == (-381));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 51);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 21);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-269));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-83) + "'", int12 == (-83));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-373) + "'", int14 == (-373));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-72));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-24));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-477));
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-353));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-176) + "'", int12 == (-176));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-128) + "'", int15 == (-128));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-581) + "'", int17 == (-581));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-313) + "'", int19 == (-313));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-457) + "'", int21 == (-457));
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-213));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-323));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 21);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-269));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-300));
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-109));
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-83) + "'", int12 == (-83));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-373) + "'", int14 == (-373));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-404) + "'", int17 == (-404));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-213) + "'", int19 == (-213));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 51 + "'", int22 == 51);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-603));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-549));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-800));
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-707) + "'", int13 == (-707));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-653) + "'", int16 == (-653));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-904) + "'", int20 == (-904));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 51);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-5));
        int int22 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-176));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-44));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-19));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-69));
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-212));
        int int24 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int25 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int27 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-319));
        int int28 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-104) + "'", int12 == (-104));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-148) + "'", int14 == (-148));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-123) + "'", int17 == (-123));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-173) + "'", int20 == (-173));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-316) + "'", int23 == (-316));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 51 + "'", int24 == 51);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 53 + "'", int25 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-423) + "'", int27 == (-423));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 53 + "'", int28 == 53);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-968));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-94) + "'", int13 == (-94));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1072) + "'", int17 == (-1072));
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-921));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-469));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-41));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-252));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-167) + "'", int11 == (-167));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-145) + "'", int14 == (-145));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-356) + "'", int16 == (-356));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-108));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-393));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-41));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-829));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-167) + "'", int11 == (-167));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-145) + "'", int14 == (-145));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-933) + "'", int18 == (-933));
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-125) + "'", int11 == (-125));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-104) + "'", int13 == (-104));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-7));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-167));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-4));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-111) + "'", int10 == (-111));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-271) + "'", int12 == (-271));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-108) + "'", int14 == (-108));
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 84);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-687));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-167) + "'", int14 == (-167));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-143));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-104) + "'", int13 == (-104));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-247) + "'", int15 == (-247));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-933));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-953) + "'", int12 == (-953));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-919));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1023) + "'", int14 == (-1023));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-19));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-935));
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-313) + "'", int9 == (-313));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-123) + "'", int11 == (-123));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1039) + "'", int19 == (-1039));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-104) + "'", int21 == (-104));
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-269));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, 0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-333) + "'", int11 == (-333));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-64) + "'", int14 == (-64));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 43 + "'", int16 == 43);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-269));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-420));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-111));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-72));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-707));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-148));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-252) + "'", int14 == (-252));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-876));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-72) + "'", int5 == (-72));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-69) + "'", int9 == (-69));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-980) + "'", int11 == (-980));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-335));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-399));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-158));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-439) + "'", int10 == (-439));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-503) + "'", int12 == (-503));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-262) + "'", int16 == (-262));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-5));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-447));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-635));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-607));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-44));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-441));
        int int24 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-221));
        int int25 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int27 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-488));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-104) + "'", int12 == (-104));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-148) + "'", int14 == (-148));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53 + "'", int20 == 53);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-545) + "'", int22 == (-545));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-325) + "'", int24 == (-325));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 53 + "'", int25 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-592) + "'", int27 == (-592));
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 51);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-52));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-607));
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-128));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-705));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-228));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-811));
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-104) + "'", int14 == (-104));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-915) + "'", int16 == (-915));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-64));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-168) + "'", int11 == (-168));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-208));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-4));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-54));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-312) + "'", int15 == (-312));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-108) + "'", int17 == (-108));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53 + "'", int20 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51 + "'", int21 == 51);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-158) + "'", int23 == (-158));
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-341));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-445) + "'", int11 == (-445));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-72));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-333));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-343));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-751));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-791));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-103) + "'", int9 == (-103));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-855) + "'", int14 == (-855));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-895) + "'", int17 == (-895));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) -1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-103));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-193));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) 'a');
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-939));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-229));
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-333) + "'", int11 == (-333));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-72));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-94) + "'", int11 == (-94));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-176) + "'", int13 == (-176));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-269));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-343));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-447) + "'", int12 == (-447));
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-108));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-543));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-105));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-520));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-540) + "'", int12 == (-540));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-260));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-364) + "'", int14 == (-364));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-403));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-437));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 36);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-507) + "'", int10 == (-507));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-541) + "'", int13 == (-541));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-68) + "'", int16 == (-68));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-520));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-19));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-155));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-51));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-193));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-155) + "'", int13 == (-155));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-297) + "'", int15 == (-297));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-417));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-521) + "'", int11 == (-521));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-167) + "'", int15 == (-167));
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-316));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-103) + "'", int6 == (-103));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-420) + "'", int8 == (-420));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-399));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '#');
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-503) + "'", int15 == (-503));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-69) + "'", int17 == (-69));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 51);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-52));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-51));
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int22 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-52));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-24));
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-72) + "'", int5 == (-72));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-156) + "'", int9 == (-156));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-128) + "'", int11 == (-128));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1248));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-71));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 12);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 10);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-175) + "'", int8 == (-175));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-92) + "'", int10 == (-92));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-94) + "'", int12 == (-94));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 10);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) 'a');
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-94) + "'", int12 == (-94));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-52));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-457));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-624));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-923));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-625));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-104) + "'", int10 == (-104));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-19) + "'", int10 == (-19));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-313));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-271));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-488));
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-417) + "'", int12 == (-417));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-375) + "'", int14 == (-375));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-104) + "'", int18 == (-104));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-592) + "'", int20 == (-592));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-416));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 1);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-317));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-520) + "'", int10 == (-520));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-103) + "'", int12 == (-103));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-52) + "'", int14 == (-52));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-421) + "'", int18 == (-421));
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 10);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 10);
        int int22 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-707));
        int int23 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-94) + "'", int12 == (-94));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-104) + "'", int15 == (-104));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-94) + "'", int20 == (-94));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-811) + "'", int22 == (-811));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 53 + "'", int23 == 53);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, 1);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-63) + "'", int8 == (-63));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 43 + "'", int10 == 43);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 43 + "'", int11 == 43);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 43 + "'", int12 == 43);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-232));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-148));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-197));
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-923));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-125) + "'", int11 == (-125));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1027) + "'", int16 == (-1027));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-52) + "'", int18 == (-52));
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 51);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-52));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-543));
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-439));
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int23 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-239));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-167));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-207));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-1063));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-271) + "'", int9 == (-271));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-311) + "'", int13 == (-311));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1167) + "'", int15 == (-1167));
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-24));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-104) + "'", int13 == (-104));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-128) + "'", int17 == (-128));
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-271));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-335) + "'", int8 == (-335));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 43 + "'", int9 == 43);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 43 + "'", int10 == 43);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 43 + "'", int11 == 43);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-884));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 21);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-705));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-540));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-279));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-353));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-383) + "'", int14 == (-383));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-457) + "'", int16 == (-457));
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-24));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, 15);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-7));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, 0);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-656));
        int int23 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-968));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-44) + "'", int10 == (-44));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-5) + "'", int14 == (-5));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-27) + "'", int16 == (-27));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-20) + "'", int19 == (-20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-676) + "'", int21 == (-676));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-988) + "'", int23 == (-988));
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-467));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-300));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-167) + "'", int12 == (-167));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-404) + "'", int15 == (-404));
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-156));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-1455));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-220) + "'", int9 == (-220));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 43 + "'", int10 == 43);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1519) + "'", int12 == (-1519));
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-448));
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-103) + "'", int9 == (-103));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-51) + "'", int14 == (-51));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-552) + "'", int18 == (-552));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 15);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-128));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-213));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-89) + "'", int12 == (-89));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-232) + "'", int15 == (-232));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-317) + "'", int17 == (-317));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 80);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-208));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-269));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-24) + "'", int7 == (-24));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-312) + "'", int9 == (-312));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-373) + "'", int13 == (-373));
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-24));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-7));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-936));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-44) + "'", int10 == (-44));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-27) + "'", int12 == (-27));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-956) + "'", int19 == (-956));
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-19));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 21);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-853));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-313) + "'", int9 == (-313));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-123) + "'", int11 == (-123));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-83) + "'", int14 == (-83));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-957) + "'", int17 == (-957));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 33);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-128));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-71) + "'", int10 == (-71));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-232) + "'", int12 == (-232));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-61) + "'", int14 == (-61));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-104) + "'", int16 == (-104));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-269));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-373) + "'", int12 == (-373));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-104) + "'", int16 == (-104));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-335));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-104));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-477));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-313));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-439) + "'", int10 == (-439));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-208) + "'", int12 == (-208));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-581) + "'", int14 == (-581));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-417) + "'", int17 == (-417));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-439));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-439));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-459) + "'", int10 == (-459));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-459) + "'", int12 == (-459));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 21);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-269));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-300));
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-109));
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 10);
        int int23 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-83) + "'", int12 == (-83));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-373) + "'", int14 == (-373));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-404) + "'", int17 == (-404));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-213) + "'", int19 == (-213));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-94) + "'", int21 == (-94));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-104) + "'", int23 == (-104));
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 15);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-312));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-91));
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-69));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-89) + "'", int12 == (-89));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-416) + "'", int14 == (-416));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-195) + "'", int17 == (-195));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-173) + "'", int19 == (-173));
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 21);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-269));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-1));
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-125));
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-252));
        int int24 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-83) + "'", int12 == (-83));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-373) + "'", int14 == (-373));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-105) + "'", int17 == (-105));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-229) + "'", int19 == (-229));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53 + "'", int20 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-356) + "'", int23 == (-356));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 51 + "'", int24 == 51);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-173));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-68));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 21);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-83) + "'", int12 == (-83));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-165));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-1059));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-941));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1163) + "'", int8 == (-1163));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1045) + "'", int10 == (-1045));
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) -1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-551));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }
}

