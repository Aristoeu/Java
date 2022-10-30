package GCD;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass32 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        int int2 = com.thealgorithms.maths.GCD.gcd(32, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        int int2 = com.thealgorithms.maths.GCD.gcd(97, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        int int2 = com.thealgorithms.maths.GCD.gcd(52, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 10, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 10, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        int int2 = com.thealgorithms.maths.GCD.gcd(5, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        int int2 = com.thealgorithms.maths.GCD.gcd(35, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        int int2 = com.thealgorithms.maths.GCD.gcd(10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        int int2 = com.thealgorithms.maths.GCD.gcd(32, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        int int2 = com.thealgorithms.maths.GCD.gcd(100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        int int2 = com.thealgorithms.maths.GCD.gcd(35, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        int int2 = com.thealgorithms.maths.GCD.gcd(35, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 100, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        int[] intArray2 = new int[] { 10, (byte) 10 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass30 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass18 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        int int2 = com.thealgorithms.maths.GCD.gcd(32, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int2 = com.thealgorithms.maths.GCD.gcd(52, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        int int2 = com.thealgorithms.maths.GCD.gcd(32, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass5 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        int int2 = com.thealgorithms.maths.GCD.gcd(5, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        int int2 = com.thealgorithms.maths.GCD.gcd(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        int int2 = com.thealgorithms.maths.GCD.gcd(35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        int int2 = com.thealgorithms.maths.GCD.gcd(97, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass16 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '4', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        int int2 = com.thealgorithms.maths.GCD.gcd(52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        int int2 = com.thealgorithms.maths.GCD.gcd(35, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        int int2 = com.thealgorithms.maths.GCD.gcd(32, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        int int2 = com.thealgorithms.maths.GCD.gcd(100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        int int2 = com.thealgorithms.maths.GCD.gcd(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        int int2 = com.thealgorithms.maths.GCD.gcd(5, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass5 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass6 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        int int2 = com.thealgorithms.maths.GCD.gcd(100, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        int int2 = com.thealgorithms.maths.GCD.gcd(97, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        int int2 = com.thealgorithms.maths.GCD.gcd(10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        int int2 = com.thealgorithms.maths.GCD.gcd(35, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        int int2 = com.thealgorithms.maths.GCD.gcd(35, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        int[] intArray6 = new int[] { '4', 35, 0, 0, 2, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 35, 0, 0, 2, -1]");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '4', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass7 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass34 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        int int2 = com.thealgorithms.maths.GCD.gcd(1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass8 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '4', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        int int2 = com.thealgorithms.maths.GCD.gcd(52, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 100, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((-1), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '4', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass7 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass3 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        int int2 = com.thealgorithms.maths.GCD.gcd(100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        int int2 = com.thealgorithms.maths.GCD.gcd(52, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(52, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        int int2 = com.thealgorithms.maths.GCD.gcd(10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        int int2 = com.thealgorithms.maths.GCD.gcd(10, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        int int2 = com.thealgorithms.maths.GCD.gcd(32, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        int int2 = com.thealgorithms.maths.GCD.gcd(2, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        int int2 = com.thealgorithms.maths.GCD.gcd(52, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        int int2 = com.thealgorithms.maths.GCD.gcd(97, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        int int2 = com.thealgorithms.maths.GCD.gcd(1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((-1), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass21 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        int[] intArray2 = new int[] { (short) 10, 97 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        int int2 = com.thealgorithms.maths.GCD.gcd(97, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass38 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        int int2 = com.thealgorithms.maths.GCD.gcd(32, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        int int2 = com.thealgorithms.maths.GCD.gcd(100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        int int2 = com.thealgorithms.maths.GCD.gcd(5, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        int int2 = com.thealgorithms.maths.GCD.gcd(5, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        int[] intArray5 = new int[] { (byte) -1, '#', 2, 32, 35 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = com.thealgorithms.maths.GCD.gcd(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 35, 2, 32, 35]");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        int int2 = com.thealgorithms.maths.GCD.gcd(35, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass24 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        int int2 = com.thealgorithms.maths.GCD.gcd(10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass23 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass28 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        int[] intArray2 = new int[] { (short) 10, 97 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        int int2 = com.thealgorithms.maths.GCD.gcd(100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        int int2 = com.thealgorithms.maths.GCD.gcd(10, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        int int2 = com.thealgorithms.maths.GCD.gcd(32, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 10, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        int int2 = com.thealgorithms.maths.GCD.gcd(10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass14 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass26 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        int int2 = com.thealgorithms.maths.GCD.gcd(2, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass36 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        int[] intArray2 = new int[] { (short) 10, 97 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 0, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        int[] intArray2 = new int[] { (short) 10, 97 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 10, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass29 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        int int2 = com.thealgorithms.maths.GCD.gcd(0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        int int2 = com.thealgorithms.maths.GCD.gcd(2, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        int int2 = com.thealgorithms.maths.GCD.gcd(5, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass16 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        int[] intArray4 = new int[] { 4, (short) 0, (byte) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[4, 0, -1, -1]");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        int[] intArray2 = new int[] { (short) 10, 97 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(35, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        int int2 = com.thealgorithms.maths.GCD.gcd(2, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass32 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        int int2 = com.thealgorithms.maths.GCD.gcd(97, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass13 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        int int2 = com.thealgorithms.maths.GCD.gcd(97, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        int int2 = com.thealgorithms.maths.GCD.gcd(35, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        int[] intArray2 = new int[] { 10, (byte) 10 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass33 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        int int2 = com.thealgorithms.maths.GCD.gcd(35, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        int int2 = com.thealgorithms.maths.GCD.gcd(97, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass10 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        int int2 = com.thealgorithms.maths.GCD.gcd(35, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 100, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass15 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass18 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass34 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        int int2 = com.thealgorithms.maths.GCD.gcd(1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass20 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        int int2 = com.thealgorithms.maths.GCD.gcd(2, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        int int2 = com.thealgorithms.maths.GCD.gcd(52, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass30 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        int int2 = com.thealgorithms.maths.GCD.gcd(32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        int int2 = com.thealgorithms.maths.GCD.gcd(35, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        int[] intArray3 = new int[] { 5, (byte) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[5, -1, 1]");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        int int2 = com.thealgorithms.maths.GCD.gcd(10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        int int2 = com.thealgorithms.maths.GCD.gcd(32, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        int int2 = com.thealgorithms.maths.GCD.gcd(52, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        int int2 = com.thealgorithms.maths.GCD.gcd(97, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass13 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        int[] intArray3 = new int[] { (byte) 1, 0, (short) 100 };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        int int2 = com.thealgorithms.maths.GCD.gcd(2, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        int[] intArray2 = new int[] { (short) 10, 97 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass18 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        int int2 = com.thealgorithms.maths.GCD.gcd(4, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass12 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass35 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        int[] intArray6 = new int[] { (byte) 0, '#', ' ', 32, (short) 10, 52 };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 32, 32, 10, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int int2 = com.thealgorithms.maths.GCD.gcd(5, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        int[] intArray2 = new int[] { 10, (byte) 10 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass17 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        int[] intArray2 = new int[] { (short) 10, 97 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass19 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        int[] intArray2 = new int[] { 10, (byte) 10 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass14 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass30 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass22 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        int int2 = com.thealgorithms.maths.GCD.gcd(1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        int[] intArray3 = new int[] { (byte) 1, 0, (short) 100 };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        int int2 = com.thealgorithms.maths.GCD.gcd(1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        int int2 = com.thealgorithms.maths.GCD.gcd(2, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        int[] intArray4 = new int[] { 32, 4, 2, (byte) 10 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass6 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 4, 2, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        int int2 = com.thealgorithms.maths.GCD.gcd(32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        int[] intArray2 = new int[] { 10, (byte) 10 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass21 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass14 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass41 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass36 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        int[] intArray6 = new int[] { (byte) 0, '#', ' ', 32, (short) 10, 52 };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 32, 32, 10, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        int[] intArray2 = new int[] { 10, (byte) 10 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        int[] intArray4 = new int[] { 35, (-1), 2, 32 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, -1, 2, 32]");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        int[] intArray2 = new int[] { 10, (byte) 10 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass20 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass32 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass16 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        int int2 = com.thealgorithms.maths.GCD.gcd(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass22 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass24 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        int int2 = com.thealgorithms.maths.GCD.gcd(100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        int[] intArray2 = new int[] { 10, (byte) 10 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass37 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass36 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (short) 100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass38 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass18 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass23 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass40 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCD.gcd(35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        int[] intArray6 = new int[] { (byte) 0, '#', ' ', 32, (short) 10, 52 };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 32, 32, 10, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass42 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass25 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass38 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) (byte) 10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass18 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass30 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int42 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int43 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass44 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        int[] intArray3 = new int[] { (byte) 1, 0, (short) 100 };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass16 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass24 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass17 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass31 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass41 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass15 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass20 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass40 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int42 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass43 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        int[] intArray6 = new int[] { (byte) 0, '#', ' ', 32, (short) 10, 52 };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 32, 32, 10, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass34 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass40 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int[] intArray6 = new int[] { (byte) 0, '#', ' ', 32, (short) 10, 52 };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 32, 32, 10, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int42 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int43 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int44 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass45 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass26 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass39 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass42 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        int[] intArray6 = new int[] { (byte) 0, '#', ' ', 32, (short) 10, 52 };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 32, 32, 10, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        int[] intArray1 = new int[] { 1 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        int[] intArray3 = new int[] { 35, (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, -1, 32]");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass41 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        int[] intArray4 = new int[] { 32, 4, 2, (byte) 10 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 4, 2, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass42 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        int int2 = com.thealgorithms.maths.GCD.gcd(100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        int[] intArray6 = new int[] { (byte) 0, '#', ' ', 32, (short) 10, 52 };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 32, 32, 10, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        int[] intArray2 = new int[] { 10, (byte) 10 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        int[] intArray3 = new int[] { (byte) 1, 0, (short) 100 };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass25 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int42 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int43 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int44 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int45 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass46 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int42 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass43 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass35 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        int[] intArray3 = new int[] { (byte) 1, 0, (short) 100 };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass26 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int42 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int43 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int44 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int45 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int46 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass47 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass28 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        int[] intArray2 = new int[] { 0, 4 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 4]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass27 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass19 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        int[] intArray6 = new int[] { (byte) 0, '#', ' ', 32, (short) 10, 52 };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 32, 32, 10, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int42 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass43 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        int[] intArray6 = new int[] { (byte) 0, '#', ' ', 32, (short) 10, 52 };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35, 32, 32, 10, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        int[] intArray1 = new int[] { 1 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass3 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int42 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int43 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass44 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        int[] intArray4 = new int[] { 32, 4, 2, (byte) 10 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 4, 2, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        int[] intArray2 = new int[] { '#', (short) 1 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int42 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int43 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int44 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int45 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int46 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int47 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass48 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        int[] intArray1 = new int[] { 100 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass28 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        int[] intArray5 = new int[] { 97, 97, (short) -1, 4, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = com.thealgorithms.maths.GCD.gcd(intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 97, -1, 4, 100]");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        int[] intArray3 = new int[] { 32, 32, 'a' };
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray3);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray3);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 97]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        int[] intArray4 = new int[] { (byte) 1, 4, (byte) 1, (byte) 100 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass6 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 4, 1, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        int[] intArray1 = new int[] { 10 };
        int int2 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray1);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray1);
        java.lang.Class<?> wildcardClass20 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        int[] intArray4 = new int[] { (short) 10, 100, '4', 1 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        int[] intArray4 = new int[] { 32, 4, 2, (byte) 10 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 4, 2, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        int[] intArray6 = new int[] { 52, (byte) 10, (byte) 0, '#', '4', '#' };
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int42 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int43 = com.thealgorithms.maths.GCD.gcd(intArray6);
        int int44 = com.thealgorithms.maths.GCD.gcd(intArray6);
        java.lang.Class<?> wildcardClass45 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52, 10, 0, 35, 52, 35]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        int[] intArray2 = new int[] { 52, (byte) 0 };
        int int3 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int4 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int27 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int28 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int29 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int30 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int31 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int32 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int33 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int34 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int35 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int36 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int37 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int38 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int39 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int40 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int41 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int42 = com.thealgorithms.maths.GCD.gcd(intArray2);
        int int43 = com.thealgorithms.maths.GCD.gcd(intArray2);
        java.lang.Class<?> wildcardClass44 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int int2 = com.thealgorithms.maths.GCD.gcd((int) ' ', 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        int[] intArray4 = new int[] { 32, 4, 2, (byte) 10 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass8 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 4, 2, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        int[] intArray4 = new int[] { (byte) 1, 4, (byte) 1, (byte) 100 };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 4, 1, 100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        int[] intArray4 = new int[] { (short) 100, (byte) 1, 'a', 'a' };
        int int5 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int6 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int7 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int8 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int9 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int10 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int11 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int12 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int13 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int14 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int15 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int16 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int17 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int18 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int19 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int20 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int21 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int22 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int23 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int24 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int25 = com.thealgorithms.maths.GCD.gcd(intArray4);
        int int26 = com.thealgorithms.maths.GCD.gcd(intArray4);
        java.lang.Class<?> wildcardClass27 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 97, 97]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }
}

