package PiNilakantha;

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
            double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Please input Integer Number between 0 and 500");
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
        com.thealgorithms.maths.PiNilakantha piNilakantha0 = new com.thealgorithms.maths.PiNilakantha();
        java.lang.Class<?> wildcardClass1 = piNilakantha0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1666666666666665d + "'", double1 == 3.1666666666666665d);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1415980068013516d + "'", double1 == 3.1415980068013516d);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1666666666666665d + "'", double1 == 3.1666666666666665d);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1415924109719824d + "'", double1 == 3.1415924109719824d);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1415929191758516d + "'", double1 == 3.1415929191758516d);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi(10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1414067184965018d + "'", double1 == 3.1414067184965018d);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi(100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1415924109719824d + "'", double1 == 3.1415924109719824d);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1414067184965018d + "'", double1 == 3.1414067184965018d);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141590975097676d + "'", double1 == 3.141590975097676d);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1414067184965018d + "'", double1 == 3.1414067184965018d);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1666666666666665d + "'", double1 == 3.1666666666666665d);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Please input Integer Number between 0 and 500");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1415924109719824d + "'", double1 == 3.1415924109719824d);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Please input Integer Number between 0 and 500");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        double double1 = com.thealgorithms.maths.PiNilakantha.calculatePi((int) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1415857049341174d + "'", double1 == 3.1415857049341174d);
    }
}

