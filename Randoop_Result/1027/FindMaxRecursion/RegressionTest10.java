package FindMaxRecursion;

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
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 0);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, (int) (short) 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int36 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int38 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int40 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int42 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1, 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass34 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) ' ', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, (int) (byte) 0);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (short) 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        java.lang.Class<?> wildcardClass20 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        java.lang.Class<?> wildcardClass18 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.maths.FindMaxRecursion.max(intArray0, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, (int) (byte) 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass32 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 0);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.maths.FindMaxRecursion.max(intArray0, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int36 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, 0);
        int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, 1);
        int int37 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, 1);
        java.lang.Class<?> wildcardClass38 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 0);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass36 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 0);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, (int) (byte) 0);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '#', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, (int) (byte) 0);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 0);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass32 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 0);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 0);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int38 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int40 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int43 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int46 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, 0);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int37 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int39 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int41 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, (int) (byte) 0);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        int[] intArray2 = new int[] { ' ', (short) 100 };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (short) 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 0);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int36 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        int int38 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass39 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        int[] intArray4 = new int[] { 52, 0, (byte) 100, 100 };
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, 0, 100, 100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.maths.FindMaxRecursion.max(intArray0, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass35 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, (int) (byte) 0);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.maths.FindMaxRecursion.max(intArray0, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 0);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 0);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass33 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, (int) (byte) 0);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int37 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.maths.FindMaxRecursion.max(intArray0, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int37 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass36 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 0);
        int int36 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int39 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (short) 0);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 0);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 0, 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass35 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (short) 0);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 32, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, (int) (short) 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int36 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, (int) (short) 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, 0);
        java.lang.Class<?> wildcardClass28 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.FindMaxRecursion.max(intArray0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, 0);
        int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, 1);
        int int37 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int36 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.maths.FindMaxRecursion.max(intArray0, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass35 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (short) 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 32, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        java.lang.Class<?> wildcardClass30 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, (int) (byte) 0);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, 0);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, 0);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (short) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 0, 0);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray2, 32, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 0);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 1);
        int int34 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (short) 0);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 0);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1, 1);
        int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 0, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, 0);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        int[] intArray4 = new int[] { (byte) -1, (short) 10, (short) 0, 1 };
        int int6 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, 0, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray4, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, 1);
        int int15 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int24 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        java.lang.Class<?> wildcardClass27 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 0);
        int int18 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 32, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int12 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMaxRecursion.max(intArray3, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 0, 1);
        int int14 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, 1);
        int int23 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 0, (int) (short) 0);
        int int25 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, 1);
        int int27 = com.thealgorithms.maths.FindMaxRecursion.max(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }
}
