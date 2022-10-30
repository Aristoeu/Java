package SquareRootWithNewtonRaphsonMethod;

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
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
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
        com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod squareRootWithNewtonRaphsonMethod0 = new com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod();
        java.lang.Class<?> wildcardClass1 = squareRootWithNewtonRaphsonMethod0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099616d + "'", double1 == 5.916079783099616d);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.848857801796104d + "'", double1 == 9.848857801796104d);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot(10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.162277660168379d + "'", double1 == 3.162277660168379d);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot(100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.162277660168379d + "'", double1 == 3.162277660168379d);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.211102550927979d + "'", double1 == 7.211102550927979d);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.162277660168379d + "'", double1 == 3.162277660168379d);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot(0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        double double1 = com.thealgorithms.maths.SquareRootWithNewtonRaphsonMethod.squareRoot((int) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.65685424949238d + "'", double1 == 5.65685424949238d);
    }
}

