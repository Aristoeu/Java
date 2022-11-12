package MinimumSumPartition;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.thealgorithms.dynamicprogramming.MinimumSumPartition minimumSumPartition0 = new com.thealgorithms.dynamicprogramming.MinimumSumPartition();
        java.lang.Class<?> wildcardClass1 = minimumSumPartition0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int[] intArray6 = new int[] { 'a', (short) 1, 53, 10, (-21), 53 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 194 out of bounds for length 194");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, 53, 10, -21, 53]");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int[] intArray4 = new int[] { 53, (short) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 53 out of bounds for length 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[53, 1, -1, -1]");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass5 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-72) + "'", int5 == (-72));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int[] intArray4 = new int[] { 'a', (-72), (short) 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 73 out of bounds for length 46");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[97, -72, 10, 10]");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-72));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass4 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-1));
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-21) + "'", int5 == (-21));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-72));
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-24));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-7));
        java.lang.Class<?> wildcardClass13 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-44) + "'", int10 == (-44));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-27) + "'", int12 == (-27));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-72) + "'", int5 == (-72));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, 1);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-63) + "'", int8 == (-63));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-72));
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local2>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-167));
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-19) + "'", int10 == (-19));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-24));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-7) + "'", int11 == (-7));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-128) + "'", int13 == (-128));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-125) + "'", int11 == (-125));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-1));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        java.lang.Class<?> wildcardClass7 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-21) + "'", int5 == (-21));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-105));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass4 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) -1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 80);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-208));
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-24) + "'", int7 == (-24));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-312) + "'", int9 == (-312));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-72));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 51);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-53) + "'", int14 == (-53));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-52));
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-123));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 21);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-269));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-103) + "'", int14 == (-103));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-103) + "'", int9 == (-103));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-72) + "'", int5 == (-72));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-271));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-335) + "'", int8 == (-335));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 43 + "'", int9 == 43);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-7));
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-111) + "'", int10 == (-111));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-165));
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-269) + "'", int13 == (-269));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 21);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-313) + "'", int9 == (-313));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 33);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-71) + "'", int12 == (-71));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-69) + "'", int9 == (-69));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 100);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-103) + "'", int9 == (-103));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-335));
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-63) + "'", int8 == (-63));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-399) + "'", int10 == (-399));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass3 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-21));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-111));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-7));
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-111) + "'", int10 == (-111));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-271));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-335) + "'", int8 == (-335));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 43 + "'", int9 == 43);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 15);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-128));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 10);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-94) + "'", int15 == (-94));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51 + "'", int16 == 51);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-208));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-72));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-105));
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-209) + "'", int14 == (-209));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-72) + "'", int5 == (-72));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-373));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-313));
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-24));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass14 = intArray1.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-19));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        java.lang.Class<?> wildcardClass4 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-83));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-105));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-416));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 1);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-520) + "'", int10 == (-520));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-103) + "'", int12 == (-103));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 100);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-103) + "'", int9 == (-103));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-229));
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-167) + "'", int9 == (-167));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-103));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-7) + "'", int10 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-165));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-19));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-27));
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-131) + "'", int14 == (-131));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass13 = intArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 80);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-24) + "'", int6 == (-24));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-51));
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-24));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-128) + "'", int7 == (-128));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-269));
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-333) + "'", int11 == (-333));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-1));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-21) + "'", int5 == (-21));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-24));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        java.lang.Class<?> wildcardClass13 = intArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int[] intArray4 = new int[] { (short) -1, (-94), (-269), (-165) };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -528");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -94, -269, -165]");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-271));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 51);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-21));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass2 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-313) + "'", int9 == (-313));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-69));
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-173) + "'", int12 == (-173));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-125));
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-229) + "'", int10 == (-229));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-24));
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-44) + "'", int10 == (-44));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-24));
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-7) + "'", int11 == (-7));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-128) + "'", int13 == (-128));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-4));
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-108) + "'", int14 == (-108));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-61));
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-165) + "'", int11 == (-165));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-313) + "'", int9 == (-313));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) 'a');
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-1));
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-7) + "'", int10 == (-7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-105) + "'", int13 == (-105));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-4));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-108) + "'", int14 == (-108));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-61) + "'", int16 == (-61));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-269));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-24));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-7));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass14 = intArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-19));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-373));
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-269));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-252));
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-333) + "'", int11 == (-333));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-316) + "'", int13 == (-316));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-53));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-416));
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-520) + "'", int13 == (-520));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-399));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-503) + "'", int10 == (-503));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 43 + "'", int7 == 43);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 43 + "'", int7 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 80);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-1));
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-24) + "'", int7 == (-24));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-24));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-44) + "'", int10 == (-44));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-208));
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-128));
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 80);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-24) + "'", int10 == (-24));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-1));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-103));
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-21) + "'", int5 == (-21));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-123) + "'", int8 == (-123));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-103) + "'", int9 == (-103));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 53);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-27));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-103));
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-167));
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-207) + "'", int17 == (-207));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-271) + "'", int19 == (-271));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-167));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-520));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-624) + "'", int8 == (-624));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-477));
        java.lang.Class<?> wildcardClass4 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-72));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-333));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-165));
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 1);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-103) + "'", int14 == (-103));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 43 + "'", int7 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 43 + "'", int8 == 43);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-167));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-271) + "'", int9 == (-271));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-4));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-108) + "'", int14 == (-108));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-61) + "'", int16 == (-61));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-24));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-7) + "'", int11 == (-7));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-128) + "'", int13 == (-128));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-19));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-195));
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-209));
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 53);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 51);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-103) + "'", int9 == (-103));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 43 + "'", int7 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-312));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-416) + "'", int10 == (-416));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-313) + "'", int9 == (-313));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 80);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-24) + "'", int7 == (-24));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-167) + "'", int9 == (-167));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 80);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-208));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-24) + "'", int7 == (-24));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-312) + "'", int9 == (-312));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-364));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-468) + "'", int11 == (-468));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-27) + "'", int16 == (-27));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-271));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, 0);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-335) + "'", int8 == (-335));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 43 + "'", int9 == 43);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-64) + "'", int11 == (-64));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-271));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-335) + "'", int8 == (-335));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 43 + "'", int9 == 43);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 43 + "'", int10 == 43);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-52) + "'", int12 == (-52));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-61));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, (-271));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray5, 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        java.lang.Class<?> wildcardClass13 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-335) + "'", int8 == (-335));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 43 + "'", int9 == 43);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-64) + "'", int11 == (-64));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-61));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-416));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520) + "'", int12 == (-520));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-4) + "'", int14 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 21);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-269));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-155));
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-259) + "'", int17 == (-259));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-69));
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-173) + "'", int13 == (-173));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-105));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-52));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 43);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 80);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 51);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-24) + "'", int7 == (-24));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-53) + "'", int9 == (-53));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-313) + "'", int9 == (-313));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-4) + "'", int13 == (-4));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-63));
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-104) + "'", int7 == (-104));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 51);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-109));
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-213) + "'", int15 == (-213));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-105));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-260));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass14 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-280) + "'", int12 == (-280));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) -1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-125));
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 43);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-27));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-131) + "'", int11 == (-131));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        java.lang.Class<?> wildcardClass6 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-20));
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-124) + "'", int13 == (-124));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-7));
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-208));
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-173));
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-277) + "'", int10 == (-277));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-7));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 80);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
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
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-19));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 1);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-105));
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-155));
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-175) + "'", int16 == (-175));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-375));
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-479) + "'", int9 == (-479));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-520));
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-104));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-52));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 43);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-269));
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-289) + "'", int8 == (-289));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-125));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 15);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-229) + "'", int10 == (-229));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-89) + "'", int12 == (-89));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-313));
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-417) + "'", int13 == (-417));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-20) + "'", int7 == (-20));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-104));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-208) + "'", int10 == (-208));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 21);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-269));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-477));
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-51));
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-108));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-647));
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-103) + "'", int9 == (-103));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-751) + "'", int14 == (-751));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-124));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-72) + "'", int5 == (-72));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-103) + "'", int9 == (-103));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-108));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-123));
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-103));
        int int18 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-207) + "'", int17 == (-207));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-104));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-105));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-260));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-280) + "'", int12 == (-280));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-19) + "'", int15 == (-19));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-497));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-601) + "'", int13 == (-601));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-289));
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-393) + "'", int12 == (-393));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-280));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-353));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-457) + "'", int14 == (-457));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-335));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-399));
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-439) + "'", int10 == (-439));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-503) + "'", int12 == (-503));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-167) + "'", int9 == (-167));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-52) + "'", int11 == (-52));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-61));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-165) + "'", int11 == (-165));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-104) + "'", int13 == (-104));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 10);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-94) + "'", int15 == (-94));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-24));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-7));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-123));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        java.lang.Class<?> wildcardClass17 = intArray1.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-143) + "'", int15 == (-143));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-103) + "'", int9 == (-103));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-104) + "'", int13 == (-104));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-335));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 100);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-103) + "'", int9 == (-103));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-439) + "'", int14 == (-439));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-4) + "'", int16 == (-4));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 21);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-104));
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-83) + "'", int12 == (-83));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-208) + "'", int14 == (-208));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 53);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-208));
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-104) + "'", int7 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-24));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-155));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-7) + "'", int11 == (-7));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-128) + "'", int13 == (-128));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-259) + "'", int17 == (-259));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-416));
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-520) + "'", int10 == (-520));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
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
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-751));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-10) + "'", int10 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-27));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-131) + "'", int11 == (-131));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-416));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-499));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520) + "'", int12 == (-520));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-603) + "'", int14 == (-603));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-44));
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-148) + "'", int11 == (-148));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-105));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-208));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-10));
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-105) + "'", int8 == (-105));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 21);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-269));
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-83) + "'", int12 == (-83));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-373) + "'", int14 == (-373));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-439));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-1));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-21) + "'", int5 == (-21));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-104));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-156));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-69));
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-260) + "'", int14 == (-260));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-173) + "'", int16 == (-173));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-19) + "'", int10 == (-19));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) ' ');
        java.lang.Class<?> wildcardClass15 = intArray1.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 53);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-1));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-103));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-280));
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-21) + "'", int5 == (-21));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-123) + "'", int8 == (-123));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-300) + "'", int10 == (-300));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 33);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-439));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-71) + "'", int10 == (-71));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-543) + "'", int12 == (-543));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-27));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-289));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-94));
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-105));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass7 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-125) + "'", int5 == (-125));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-63));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-167) + "'", int7 == (-167));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-105) + "'", int9 == (-105));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-128));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-417));
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-521) + "'", int16 == (-521));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 51 + "'", int17 == 51);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-72) + "'", int5 == (-72));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-104) + "'", int9 == (-104));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-72) + "'", int6 == (-72));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-41));
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-145) + "'", int8 == (-145));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-208));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-333));
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-104));
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-208) + "'", int13 == (-208));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-108));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-335));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-24));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-125));
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-128) + "'", int7 == (-128));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-229) + "'", int9 == (-229));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-114));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        java.lang.Class<?> wildcardClass17 = intArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-208));
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-10));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-21));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-300));
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-7));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 80);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-11));
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 21);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-601));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-52) + "'", int12 == (-52));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-83) + "'", int14 == (-83));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-705) + "'", int16 == (-705));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) '#');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-94));
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-114) + "'", int9 == (-114));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-19));
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-313) + "'", int9 == (-313));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-123) + "'", int11 == (-123));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 51);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-416));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-247));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520) + "'", int12 == (-520));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-351) + "'", int15 == (-351));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-157));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-72));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-52) + "'", int8 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-229));
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-607));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-21));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-399));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-477));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-503) + "'", int10 == (-503));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-581) + "'", int12 == (-581));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 51 + "'", int13 == 51);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-94) + "'", int8 == (-94));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-103));
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-207) + "'", int17 == (-207));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-94) + "'", int19 == (-94));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (byte) -1);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-105) + "'", int10 == (-105));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-209));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-335));
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-72) + "'", int5 == (-72));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-313) + "'", int8 == (-313));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-439) + "'", int10 == (-439));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) (short) 0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 80);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-104) + "'", int6 == (-104));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-24) + "'", int11 == (-24));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 80);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-208));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-24) + "'", int7 == (-24));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-312) + "'", int9 == (-312));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) 'a');
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-51) + "'", int5 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-61) + "'", int7 == (-61));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-7) + "'", int10 == (-7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) '#');
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-11));
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-1));
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 0);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-21));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-111));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 21);
        int int20 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int[] intArray1 = new int[] { (short) 10 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) -1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (int) (byte) 100);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray1, (-24));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray1);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray1);
        java.lang.Class<?> wildcardClass15 = intArray1.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-72) + "'", int5 == (-72));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-61));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-104) + "'", int13 == (-104));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-167));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-83));
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-4));
        int int16 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 43);
        int int17 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-108) + "'", int14 == (-108));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-61) + "'", int16 == (-61));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-521));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-477));
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-209));
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-61));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-279));
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
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
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-240));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-51) + "'", int6 == (-51));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '#');
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, 53);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-61));
        int int12 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        int[] intArray5 = new int[] { ' ', 1, (short) 0, (short) 0, (short) 10 };
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int9 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray5);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 43 + "'", int6 == 43);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 43 + "'", int7 == 43);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 43 + "'", int10 == 43);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-72) + "'", int5 == (-72));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-52) + "'", int7 == (-52));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (-297));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray2, (int) ' ');
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-72) + "'", int5 == (-72));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) -1);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getSum(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-125));
        int int11 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int5 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 100);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-69));
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-53));
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        int[] intArray0 = new int[] {};
        int int1 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int3 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-105));
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-333));
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-312));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (-72));
        int int6 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.getMin(intArray0, (int) '4');
        int int7 = com.thealgorithms.dynamicprogramming.MinimumSumPartition.subSet(intArray0);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}
