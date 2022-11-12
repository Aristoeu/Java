package FindMinRecursion;

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
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) (byte) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 100);
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
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 0);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 0);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, 0);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10, (int) 'a');
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
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 0);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 0);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, 0);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 100);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, 0);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) -1, (int) (byte) -1);
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
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, 0);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 0);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int36 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) -1, (-1));
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, 1);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.maths.FindMinRecursion.min(intArray0, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 52);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) ' ');
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
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, 1);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass35 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        int int37 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int40 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int43 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int37 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int39 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int41 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int44 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '4');
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
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        java.lang.Class<?> wildcardClass24 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        int int37 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int40 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int43 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass44 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.maths.FindMinRecursion.min(intArray0, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
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
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, 0);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, (int) (short) 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, 0);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, (int) (short) 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1, 100);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass32 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 100);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (short) 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 52);
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
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1, 52);
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
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) ' ', 100);
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
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, 0);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, (int) (short) 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (-1), (-1));
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
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, (int) (byte) 100);
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
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) (byte) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int37 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int39 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int41 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int44 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, 10);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        int int37 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int40 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int42 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 0, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, (int) (short) 0);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, 0);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, (int) (short) 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int36 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int38 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass32 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 100);
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
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, 0);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, (int) (short) 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int37 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int39 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int41 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int44 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 100);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 100);
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
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, 0);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        java.lang.Class<?> wildcardClass29 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 0);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        java.lang.Class<?> wildcardClass32 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (-1));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (-1));
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
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 100);
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
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 52);
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
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 0);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int36 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int36 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 0, (int) (short) 0);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '4', 52);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10, (int) (short) 100);
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
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (byte) 0);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 10);
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
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 10);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.maths.FindMinRecursion.min(intArray0, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int37 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 1);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, 0);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, 0);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, 0);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '4', 100);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 0);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 0, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 100);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        java.lang.Class<?> wildcardClass34 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 0);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) (byte) 0);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 0);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 100);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 0, 0);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 0);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, 0);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        java.lang.Class<?> wildcardClass36 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (byte) 1);
        int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, 0);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, (int) (short) 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) ' ');
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
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) -1, (int) (short) -1);
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
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10);
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
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 10, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 1);
        int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int38 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, 0);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) -1, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) -1, (-1));
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
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 0);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass32 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52, (int) (short) 100);
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
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (byte) 0);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1, 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 0, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 100);
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
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52, 52);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) (byte) 0);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 0);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int37 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 0, 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (byte) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 100, 100, 52, 100, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 100, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 100);
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
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        int[] intArray3 = new int[] { (byte) 100, '4', (byte) -1 };
        int int5 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 0, (int) (byte) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 0, (int) (short) 1);
        int int15 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray3, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 52, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int21 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 0, 1);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 0, (int) (short) 0);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass35 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int18 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int25 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, (int) (short) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int32 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int35 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, (int) (short) 1);
        int int37 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int40 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        int[] intArray6 = new int[] { (-1), (short) 100, (byte) 100, '4', 100, (byte) 0 };
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1, 10);
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
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int10 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int12 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int27 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1, (int) (byte) 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int34 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass35 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int19 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 1);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int28 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        int[] intArray6 = new int[] { 1, (byte) 10, (-1), (byte) 1, 'a', (byte) 100 };
        int int9 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1, 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int14 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 0);
        int int17 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 0, (int) (short) 1);
        int int20 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, 0);
        int int22 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int24 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (byte) 1);
        int int26 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 1);
        int int29 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.maths.FindMinRecursion.min(intArray6, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 10, -1, 1, 97, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        int[] intArray2 = new int[] { (short) 10, '4' };
        int int4 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int6 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 1);
        int int11 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.maths.FindMinRecursion.min(intArray2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }
}
