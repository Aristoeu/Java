package FactorialRecursion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.thealgorithms.maths.FactorialRecursion factorialRecursion0 = new com.thealgorithms.maths.FactorialRecursion();
        java.lang.Class<?> wildcardClass1 = factorialRecursion0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6399018521010896896L + "'", long1 == 6399018521010896896L);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial(1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial(10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3628800L + "'", long1 == 3628800L);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial(100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3628800L + "'", long1 == 3628800L);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-8452693550620999680L) + "'", long1 == (-8452693550620999680L));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3628800L + "'", long1 == 3628800L);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: number is negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        long long1 = com.thealgorithms.maths.FactorialRecursion.factorial((int) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-6045878379276664832L) + "'", long1 == (-6045878379276664832L));
    }
}

