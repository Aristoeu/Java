package CollatzConjecture;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber(0);
        int int20 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 88 + "'", int20 == 88);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(26);
        int int20 = collatzConjecture0.nextNumber(83);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(50);
        int int24 = collatzConjecture0.nextNumber((int) (short) 10);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250 + "'", int20 == 250);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(38);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int18 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(220);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        int int16 = collatzConjecture0.nextNumber((int) '#');
        int int18 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(274);
        int int22 = collatzConjecture0.nextNumber(53);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 160 + "'", int22 == 160);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(53);
        int int18 = collatzConjecture0.nextNumber((-2));
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(76);
        int int24 = collatzConjecture0.nextNumber(8);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 10);
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(38);
        java.lang.Class<?> wildcardClass7 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(80);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
        int int22 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(73);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 55 + "'", int22 == 55);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) '4');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(73);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(5);
        int int22 = collatzConjecture0.nextNumber((int) ' ');
        int int24 = collatzConjecture0.nextNumber(322);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(10);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 161 + "'", int24 == 161);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(100);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int20 = collatzConjecture0.nextNumber(160);
        int int22 = collatzConjecture0.nextNumber(44);
        int int24 = collatzConjecture0.nextNumber(292);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 80 + "'", int20 == 80);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 146 + "'", int24 == 146);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        int int14 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int16 = collatzConjecture0.nextNumber(188);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 94 + "'", int16 == 94);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(52);
        int int22 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(376);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        int int6 = collatzConjecture0.nextNumber(292);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int10 = collatzConjecture0.nextNumber(88);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(40);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 146 + "'", int6 == 146);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 44 + "'", int10 == 44);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(44);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(166);
        int int16 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(376);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(55);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(50);
        int int24 = collatzConjecture0.nextNumber(242);
        int int26 = collatzConjecture0.nextNumber((int) '4');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 146 + "'", int16 == 146);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 121 + "'", int24 == 121);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 26 + "'", int26 == 26);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        int int14 = collatzConjecture0.nextNumber(292);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(17);
        int int24 = collatzConjecture0.nextNumber(29);
        int int26 = collatzConjecture0.nextNumber(322);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 88 + "'", int24 == 88);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 161 + "'", int26 == 161);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(55);
        int int16 = collatzConjecture0.nextNumber(22);
        int int18 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber(2);
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(80);
        int int24 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(160);
        int int28 = collatzConjecture0.nextNumber(94);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 47 + "'", int28 == 47);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber(5);
        int int22 = collatzConjecture0.nextNumber(25);
        int int24 = collatzConjecture0.nextNumber(19);
        int int26 = collatzConjecture0.nextNumber(20);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(4);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 76 + "'", int22 == 76);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 58 + "'", int24 == 58);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(76);
        int int24 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) '4');
        int int28 = collatzConjecture0.nextNumber((-1));
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        int int18 = collatzConjecture0.nextNumber(76);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        int int18 = collatzConjecture0.nextNumber(17);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(55);
        int int22 = collatzConjecture0.nextNumber(91);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 274 + "'", int22 == 274);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(80);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(94);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        int int20 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(484);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber(8);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(376);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber((int) 'a');
        int int14 = collatzConjecture0.nextNumber((int) (short) 10);
        int int16 = collatzConjecture0.nextNumber(25);
        int int18 = collatzConjecture0.nextNumber((int) '#');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 106 + "'", int18 == 106);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(25);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) '4');
        int int24 = collatzConjecture0.nextNumber(38);
        int int26 = collatzConjecture0.nextNumber(47);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 142 + "'", int26 == 142);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(106);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(25);
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(107);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(100);
        int int24 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '#');
        int int30 = collatzConjecture0.nextNumber((int) (short) 100);
        int int32 = collatzConjecture0.nextNumber(166);
        java.lang.Class<?> wildcardClass33 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50 + "'", int30 == 50);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 83 + "'", int32 == 83);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 10);
        int int20 = collatzConjecture0.nextNumber(83);
        int int22 = collatzConjecture0.nextNumber((int) (short) 10);
        int int24 = collatzConjecture0.nextNumber(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250 + "'", int20 == 250);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(25);
        int int20 = collatzConjecture0.nextNumber((int) (short) 10);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(250);
        int int18 = collatzConjecture0.nextNumber((int) (short) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((-2));
        int int18 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 106 + "'", int18 == 106);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(73);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(5);
        int int22 = collatzConjecture0.nextNumber((int) ' ');
        int int24 = collatzConjecture0.nextNumber(322);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 161 + "'", int24 == 161);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(29);
        int int24 = collatzConjecture0.nextNumber(142);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 71 + "'", int24 == 71);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(376);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass7 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(0);
        int int18 = collatzConjecture0.nextNumber(220);
        int int20 = collatzConjecture0.nextNumber(100);
        int int22 = collatzConjecture0.nextNumber((-1));
        int int24 = collatzConjecture0.nextNumber(322);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 110 + "'", int18 == 110);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 161 + "'", int24 == 161);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(25);
        int int20 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(100);
        int int24 = collatzConjecture0.nextNumber(106);
        int int26 = collatzConjecture0.nextNumber(47);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(137);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 142 + "'", int26 == 142);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(166);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 73 + "'", int18 == 73);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int18 = collatzConjecture0.nextNumber(80);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        int int14 = collatzConjecture0.nextNumber(160);
        int int16 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
        int int22 = collatzConjecture0.nextNumber(188);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 80 + "'", int14 == 80);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 94 + "'", int22 == 94);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(160);
        int int20 = collatzConjecture0.nextNumber(29);
        int int22 = collatzConjecture0.nextNumber(2);
        int int24 = collatzConjecture0.nextNumber((-1));
        int int26 = collatzConjecture0.nextNumber(40);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 88 + "'", int20 == 88);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(16);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(160);
        int int12 = collatzConjecture0.nextNumber(34);
        int int14 = collatzConjecture0.nextNumber(25);
        int int16 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 76 + "'", int14 == 76);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(292);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber(160);
        int int26 = collatzConjecture0.nextNumber(10);
        int int28 = collatzConjecture0.nextNumber(73);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 220 + "'", int28 == 220);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(58);
        int int12 = collatzConjecture0.nextNumber(322);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 161 + "'", int12 == 161);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(292);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int22 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(50);
        int int26 = collatzConjecture0.nextNumber((int) (short) 100);
        int int28 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(142);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(4);
        java.lang.Class<?> wildcardClass33 = intList32.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 50 + "'", int26 == 50);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 25 + "'", int28 == 25);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(100);
        int int24 = collatzConjecture0.nextNumber((int) (short) 1);
        int int26 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '#');
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(322);
        int int10 = collatzConjecture0.nextNumber((int) (short) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int16 = collatzConjecture0.nextNumber((int) ' ');
        int int18 = collatzConjecture0.nextNumber((int) 'a');
        int int20 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(137);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292 + "'", int18 == 292);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(4);
        int int18 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(58);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(364);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(17);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 160 + "'", int6 == 160);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        int int14 = collatzConjecture0.nextNumber(11);
        int int16 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 73 + "'", int16 == 73);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        int int20 = collatzConjecture0.nextNumber((int) 'a');
        int int22 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(40);
        int int26 = collatzConjecture0.nextNumber(8);
        int int28 = collatzConjecture0.nextNumber((int) '#');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 106 + "'", int28 == 106);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(484);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int24 = collatzConjecture0.nextNumber((int) '4');
        int int26 = collatzConjecture0.nextNumber(4);
        int int28 = collatzConjecture0.nextNumber(38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber(17);
        int int10 = collatzConjecture0.nextNumber(83);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 250 + "'", int10 == 250);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        int int16 = collatzConjecture0.nextNumber((int) '4');
        int int18 = collatzConjecture0.nextNumber(25);
        int int20 = collatzConjecture0.nextNumber(2);
        int int22 = collatzConjecture0.nextNumber(106);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 53 + "'", int22 == 53);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        int int20 = collatzConjecture0.nextNumber(88);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 44 + "'", int20 == 44);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(26);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(76);
        int int24 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(121);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(100);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(220);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(16);
        int int24 = collatzConjecture0.nextNumber(484);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 242 + "'", int24 == 242);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) -1);
        int int18 = collatzConjecture0.nextNumber(26);
        int int20 = collatzConjecture0.nextNumber(76);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(137);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 38 + "'", int20 == 38);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) ' ');
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(250);
        int int22 = collatzConjecture0.nextNumber(76);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(22);
        int int26 = collatzConjecture0.nextNumber(2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 38 + "'", int22 == 38);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(17);
        java.lang.Class<?> wildcardClass7 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber(2);
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(80);
        int int24 = collatzConjecture0.nextNumber((-2));
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        int int18 = collatzConjecture0.nextNumber(10);
        int int20 = collatzConjecture0.nextNumber(76);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 38 + "'", int20 == 38);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int18 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(220);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(83);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(206);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 250 + "'", int6 == 250);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(53);
        int int18 = collatzConjecture0.nextNumber((-2));
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        int int22 = collatzConjecture0.nextNumber(47);
        int int24 = collatzConjecture0.nextNumber(242);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 142 + "'", int22 == 142);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 121 + "'", int24 == 121);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(38);
        int int14 = collatzConjecture0.nextNumber(71);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(364);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 214 + "'", int14 == 214);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(4);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(322);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(121);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        int int16 = collatzConjecture0.nextNumber((int) '#');
        int int18 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(29);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55 + "'", int18 == 55);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(250);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int14 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(188);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 83 + "'", int14 == 83);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(20);
        int int18 = collatzConjecture0.nextNumber((-2));
        int int20 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(146);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        int int14 = collatzConjecture0.nextNumber(160);
        int int16 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 80 + "'", int14 == 80);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(26);
        int int20 = collatzConjecture0.nextNumber(83);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(50);
        int int24 = collatzConjecture0.nextNumber(220);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(29);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250 + "'", int20 == 250);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 110 + "'", int24 == 110);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(58);
        int int18 = collatzConjecture0.nextNumber(47);
        int int20 = collatzConjecture0.nextNumber(103);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 142 + "'", int18 == 142);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 310 + "'", int20 == 310);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) '4');
        int int24 = collatzConjecture0.nextNumber(38);
        int int26 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '#');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 50 + "'", int26 == 50);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(73);
        int int18 = collatzConjecture0.nextNumber((int) (short) 100);
        int int20 = collatzConjecture0.nextNumber(250);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 125 + "'", int20 == 125);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        int int16 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) 'a');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber(0);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) -1);
        int int18 = collatzConjecture0.nextNumber(26);
        int int20 = collatzConjecture0.nextNumber(76);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(137);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 38 + "'", int20 == 38);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(76);
        int int24 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) '4');
        int int28 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(160);
        java.lang.Class<?> wildcardClass31 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(160);
        int int20 = collatzConjecture0.nextNumber(29);
        int int22 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) ' ');
        int int26 = collatzConjecture0.nextNumber(166);
        int int28 = collatzConjecture0.nextNumber((int) (short) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 88 + "'", int20 == 88);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 83 + "'", int26 == 83);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        int int18 = collatzConjecture0.nextNumber(17);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(25);
        int int20 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(4);
        int int24 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(5);
        int int22 = collatzConjecture0.nextNumber((int) (short) 100);
        int int24 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) '4');
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '#');
        int int20 = collatzConjecture0.nextNumber(5);
        int int22 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(121);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(106);
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '4');
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(10);
        int int22 = collatzConjecture0.nextNumber(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26 + "'", int22 == 26);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        int int16 = collatzConjecture0.nextNumber(4);
        int int18 = collatzConjecture0.nextNumber((-2));
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        int int16 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(17);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(26);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(11);
        int int18 = collatzConjecture0.nextNumber(250);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 125 + "'", int18 == 125);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(20);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(47);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(146);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        int int14 = collatzConjecture0.nextNumber(88);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(484);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(166);
        int int20 = collatzConjecture0.nextNumber(40);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(220);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        int int18 = collatzConjecture0.nextNumber(22);
        int int20 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(161);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(4);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        int int20 = collatzConjecture0.nextNumber(0);
        int int22 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(80);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '#');
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(38);
        int int14 = collatzConjecture0.nextNumber(71);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(80);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 214 + "'", int14 == 214);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber(19);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 58 + "'", int8 == 58);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int24 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (short) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int10 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '4');
        int int20 = collatzConjecture0.nextNumber((int) (short) 100);
        int int22 = collatzConjecture0.nextNumber(484);
        int int24 = collatzConjecture0.nextNumber(121);
        int int26 = collatzConjecture0.nextNumber(11);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 242 + "'", int22 == 242);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 364 + "'", int24 == 364);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 34 + "'", int26 == 34);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(25);
        int int20 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(100);
        int int24 = collatzConjecture0.nextNumber(106);
        int int26 = collatzConjecture0.nextNumber(91);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 274 + "'", int26 == 274);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber(8);
        int int10 = collatzConjecture0.nextNumber((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber(5);
        int int22 = collatzConjecture0.nextNumber(25);
        int int24 = collatzConjecture0.nextNumber(19);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(11);
        int int28 = collatzConjecture0.nextNumber(52);
        int int30 = collatzConjecture0.nextNumber((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 76 + "'", int22 == 76);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 58 + "'", int24 == 58);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 26 + "'", int28 == 26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) -1);
        int int18 = collatzConjecture0.nextNumber(40);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(292);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int26 = collatzConjecture0.nextNumber(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(94);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(106);
        int int16 = collatzConjecture0.nextNumber(1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(5);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        int int18 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(25);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(76);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber(2);
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(80);
        int int24 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(160);
        int int28 = collatzConjecture0.nextNumber(94);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(160);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 47 + "'", int28 == 47);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber((int) (short) 100);
        int int22 = collatzConjecture0.nextNumber(1);
        int int24 = collatzConjecture0.nextNumber(220);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(142);
        int int28 = collatzConjecture0.nextNumber(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 110 + "'", int24 == 110);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 26 + "'", int28 == 26);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(110);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 55 + "'", int12 == 55);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int20 = collatzConjecture0.nextNumber(292);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int30 = collatzConjecture0.nextNumber(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 146 + "'", int20 == 146);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 142 + "'", int30 == 142);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int20 = collatzConjecture0.nextNumber(292);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(80);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 146 + "'", int20 == 146);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(2);
        int int20 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(182);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 10);
        int int20 = collatzConjecture0.nextNumber(83);
        int int22 = collatzConjecture0.nextNumber(1);
        int int24 = collatzConjecture0.nextNumber(26);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250 + "'", int20 == 250);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 0);
        int int12 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(188);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(322);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 220 + "'", int12 == 220);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(1);
        int int14 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(29);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 106 + "'", int14 == 106);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(73);
        int int18 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(73);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(17);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(292);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber(160);
        int int26 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(38);
        int int30 = collatzConjecture0.nextNumber(53);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 160 + "'", int30 == 160);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(40);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '#');
        int int20 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(80);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber(292);
        int int14 = collatzConjecture0.nextNumber(188);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 94 + "'", int14 == 94);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int20 = collatzConjecture0.nextNumber(292);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 146 + "'", int20 == 146);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(13);
        int int16 = collatzConjecture0.nextNumber(10);
        int int18 = collatzConjecture0.nextNumber((int) '#');
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 106 + "'", int18 == 106);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(5);
        int int10 = collatzConjecture0.nextNumber(10);
        int int12 = collatzConjecture0.nextNumber(100);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(25);
        int int20 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(100);
        int int24 = collatzConjecture0.nextNumber(106);
        int int26 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(4);
        int int18 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(166);
        int int22 = collatzConjecture0.nextNumber(5);
        int int24 = collatzConjecture0.nextNumber(53);
        int int26 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 160 + "'", int24 == 160);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(13);
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int20 = collatzConjecture0.nextNumber((-2));
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(10);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int14 = collatzConjecture0.nextNumber(214);
        int int16 = collatzConjecture0.nextNumber(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 107 + "'", int14 == 107);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
        int int22 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(73);
        int int26 = collatzConjecture0.nextNumber(0);
        int int28 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int30 = collatzConjecture0.nextNumber(94);
        java.lang.Class<?> wildcardClass31 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 55 + "'", int22 == 55);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 47 + "'", int30 == 47);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(53);
        int int18 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(94);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber((int) (short) 100);
        int int22 = collatzConjecture0.nextNumber(1);
        int int24 = collatzConjecture0.nextNumber(220);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 110 + "'", int24 == 110);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(40);
        int int16 = collatzConjecture0.nextNumber(25);
        int int18 = collatzConjecture0.nextNumber(5);
        int int20 = collatzConjecture0.nextNumber(40);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(220);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(73);
        int int12 = collatzConjecture0.nextNumber((int) (short) 0);
        int int14 = collatzConjecture0.nextNumber((-1));
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(52);
        int int22 = collatzConjecture0.nextNumber(83);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 250 + "'", int22 == 250);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int24 = collatzConjecture0.nextNumber((int) ' ');
        int int26 = collatzConjecture0.nextNumber(146);
        int int28 = collatzConjecture0.nextNumber(20);
        int int30 = collatzConjecture0.nextNumber(137);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 73 + "'", int26 == 73);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 412 + "'", int30 == 412);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(19);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int14 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 83 + "'", int14 == 83);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int24 = collatzConjecture0.nextNumber(0);
        int int26 = collatzConjecture0.nextNumber(55);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(292);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 166 + "'", int26 == 166);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) '4');
        int int18 = collatzConjecture0.nextNumber(160);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber(2);
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(80);
        int int24 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(2);
        int int10 = collatzConjecture0.nextNumber(106);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(16);
        int int16 = collatzConjecture0.nextNumber(142);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 71 + "'", int16 == 71);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        int int16 = collatzConjecture0.nextNumber(4);
        int int18 = collatzConjecture0.nextNumber(19);
        int int20 = collatzConjecture0.nextNumber(40);
        int int22 = collatzConjecture0.nextNumber(292);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 146 + "'", int22 == 146);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(292);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber((int) (byte) 0);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(376);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(322);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 161 + "'", int12 == 161);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(19);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        int int18 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(80);
        int int22 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(55);
        int int12 = collatzConjecture0.nextNumber(322);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(125);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 166 + "'", int10 == 166);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 161 + "'", int12 == 161);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber(2);
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(80);
        int int24 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(160);
        int int28 = collatzConjecture0.nextNumber(94);
        int int30 = collatzConjecture0.nextNumber(58);
        java.lang.Class<?> wildcardClass31 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 47 + "'", int28 == 47);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29 + "'", int30 == 29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        int int22 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(13);
        int int26 = collatzConjecture0.nextNumber(34);
        int int28 = collatzConjecture0.nextNumber(364);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17 + "'", int26 == 17);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 182 + "'", int28 == 182);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(44);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        int int18 = collatzConjecture0.nextNumber(10);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(220);
        int int6 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(25);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(292);
        int int26 = collatzConjecture0.nextNumber(44);
        int int28 = collatzConjecture0.nextNumber((int) (short) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 22 + "'", int26 == 22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(166);
        int int16 = collatzConjecture0.nextNumber(292);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 146 + "'", int16 == 146);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(100);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(55);
        int int10 = collatzConjecture0.nextNumber(161);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 166 + "'", int8 == 166);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 484 + "'", int10 == 484);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(26);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(73);
        int int18 = collatzConjecture0.nextNumber(44);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
        int int22 = collatzConjecture0.nextNumber(40);
        int int24 = collatzConjecture0.nextNumber(161);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 484 + "'", int24 == 484);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber(38);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(292);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) 'a');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        int int10 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(73);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(100);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass7 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(29);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        int int12 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(22);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(121);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) ' ');
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(100);
        int int26 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(20);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(29);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        int int12 = collatzConjecture0.nextNumber(58);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 73 + "'", int8 == 73);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(76);
        int int24 = collatzConjecture0.nextNumber(80);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(40);
        int int16 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(188);
        int int20 = collatzConjecture0.nextNumber(73);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 220 + "'", int20 == 220);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) 'a');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        int int18 = collatzConjecture0.nextNumber(38);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(5);
        int int22 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(47);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(220);
        int int30 = collatzConjecture0.nextNumber(94);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 47 + "'", int30 == 47);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(160);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(88);
        int int20 = collatzConjecture0.nextNumber(142);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(107);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 71 + "'", int20 == 71);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(73);
        int int18 = collatzConjecture0.nextNumber((int) (short) 100);
        int int20 = collatzConjecture0.nextNumber(250);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int24 = collatzConjecture0.nextNumber((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 125 + "'", int20 == 125);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(17);
        int int24 = collatzConjecture0.nextNumber(29);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 88 + "'", int24 == 88);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(100);
        int int24 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(106);
        int int28 = collatzConjecture0.nextNumber((int) (short) 100);
        int int30 = collatzConjecture0.nextNumber(20);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(125);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(146);
        int int6 = collatzConjecture0.nextNumber(250);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(166);
        int int10 = collatzConjecture0.nextNumber(4);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 125 + "'", int6 == 125);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(94);
        int int16 = collatzConjecture0.nextNumber(250);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(55);
        int int20 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 125 + "'", int16 == 125);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(73);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(2);
        int int20 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(29);
        int int24 = collatzConjecture0.nextNumber(137);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 412 + "'", int24 == 412);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int20 = collatzConjecture0.nextNumber(53);
        int int22 = collatzConjecture0.nextNumber((int) '#');
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 160 + "'", int20 == 160);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 106 + "'", int22 == 106);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(73);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) '#');
        int int14 = collatzConjecture0.nextNumber(17);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        int int14 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(106);
        int int18 = collatzConjecture0.nextNumber(310);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 155 + "'", int18 == 155);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber(2);
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(80);
        int int24 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(73);
        int int18 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(80);
        int int26 = collatzConjecture0.nextNumber(47);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 142 + "'", int26 == 142);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(242);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(73);
        int int16 = collatzConjecture0.nextNumber(20);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(11);
        int int20 = collatzConjecture0.nextNumber(8);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        int int18 = collatzConjecture0.nextNumber(38);
        int int20 = collatzConjecture0.nextNumber(20);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(73);
        int int24 = collatzConjecture0.nextNumber(16);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(100);
        int int24 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '#');
        int int30 = collatzConjecture0.nextNumber((int) (short) 100);
        int int32 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList34 = collatzConjecture0.collatzConjecture(19);
        int int36 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50 + "'", int30 == 50);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 83 + "'", int32 == 83);
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(100);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(19);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(94);
        int int16 = collatzConjecture0.nextNumber(250);
        int int18 = collatzConjecture0.nextNumber(142);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 125 + "'", int16 == 125);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 71 + "'", int18 == 71);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(80);
        int int12 = collatzConjecture0.nextNumber(38);
        int int14 = collatzConjecture0.nextNumber(1);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(52);
        int int22 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(5);
        int int26 = collatzConjecture0.nextNumber(160);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 80 + "'", int26 == 80);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(188);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(8);
        int int20 = collatzConjecture0.nextNumber((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(292);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber((int) (byte) 0);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(8);
        int int28 = collatzConjecture0.nextNumber(58);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 29 + "'", int28 == 29);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int16 = collatzConjecture0.nextNumber((int) ' ');
        int int18 = collatzConjecture0.nextNumber((int) 'a');
        int int20 = collatzConjecture0.nextNumber((int) ' ');
        int int22 = collatzConjecture0.nextNumber(5);
        int int24 = collatzConjecture0.nextNumber(40);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(125);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292 + "'", int18 == 292);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        int int22 = collatzConjecture0.nextNumber(47);
        int int24 = collatzConjecture0.nextNumber(83);
        int int26 = collatzConjecture0.nextNumber(121);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(76);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 142 + "'", int22 == 142);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 250 + "'", int24 == 250);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 364 + "'", int26 == 364);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        int int16 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(91);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        int int14 = collatzConjecture0.nextNumber(160);
        int int16 = collatzConjecture0.nextNumber(1);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 80 + "'", int14 == 80);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        int int18 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(26);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(22);
        int int12 = collatzConjecture0.nextNumber(55);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 166 + "'", int12 == 166);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(73);
        int int20 = collatzConjecture0.nextNumber(484);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(137);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 242 + "'", int20 == 242);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(160);
        int int10 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(88);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) -1);
        int int18 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(220);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(100);
        int int12 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(220);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(25);
        int int20 = collatzConjecture0.nextNumber(376);
        int int22 = collatzConjecture0.nextNumber(250);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(52);
        int int26 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 188 + "'", int20 == 188);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 125 + "'", int22 == 125);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(40);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(142);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int10 = collatzConjecture0.nextNumber(44);
        int int12 = collatzConjecture0.nextNumber(2);
        int int14 = collatzConjecture0.nextNumber(11);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(100);
        int int24 = collatzConjecture0.nextNumber((int) (short) 1);
        int int26 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(40);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(11);
        int int12 = collatzConjecture0.nextNumber(250);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 125 + "'", int12 == 125);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(76);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(107);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber(8);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber(34);
        int int18 = collatzConjecture0.nextNumber(322);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 161 + "'", int18 == 161);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        int int18 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(80);
        int int22 = collatzConjecture0.nextNumber((int) (short) 0);
        int int24 = collatzConjecture0.nextNumber(88);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 44 + "'", int24 == 44);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int18 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(53);
        int int22 = collatzConjecture0.nextNumber(292);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 146 + "'", int22 == 146);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(73);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) '#');
        int int14 = collatzConjecture0.nextNumber(17);
        int int16 = collatzConjecture0.nextNumber(146);
        int int18 = collatzConjecture0.nextNumber(25);
        int int20 = collatzConjecture0.nextNumber((int) (short) 10);
        int int22 = collatzConjecture0.nextNumber(125);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 73 + "'", int16 == 73);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 376 + "'", int22 == 376);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(22);
        int int24 = collatzConjecture0.nextNumber(94);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 47 + "'", int24 == 47);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int20 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int24 = collatzConjecture0.nextNumber(106);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber((-2));
        int int12 = collatzConjecture0.nextNumber(71);
        int int14 = collatzConjecture0.nextNumber(142);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 214 + "'", int12 == 214);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(94);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber(4);
        int int12 = collatzConjecture0.nextNumber(11);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(100);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int22 = collatzConjecture0.nextNumber(76);
        int int24 = collatzConjecture0.nextNumber(0);
        int int26 = collatzConjecture0.nextNumber((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 38 + "'", int22 == 38);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(100);
        int int12 = collatzConjecture0.nextNumber(88);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber(19);
        int int10 = collatzConjecture0.nextNumber(71);
        int int12 = collatzConjecture0.nextNumber(47);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 58 + "'", int8 == 58);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 214 + "'", int10 == 214);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 142 + "'", int12 == 142);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        int int22 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(47);
        int int26 = collatzConjecture0.nextNumber(106);
        int int28 = collatzConjecture0.nextNumber(94);
        int int30 = collatzConjecture0.nextNumber(310);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 47 + "'", int28 == 47);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 155 + "'", int30 == 155);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(2);
        int int20 = collatzConjecture0.nextNumber(292);
        int int22 = collatzConjecture0.nextNumber(110);
        int int24 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 146 + "'", int20 == 146);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 55 + "'", int22 == 55);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(44);
        int int14 = collatzConjecture0.nextNumber(125);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        int int18 = collatzConjecture0.nextNumber((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        int int18 = collatzConjecture0.nextNumber(10);
        int int20 = collatzConjecture0.nextNumber(0);
        int int22 = collatzConjecture0.nextNumber((int) (short) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(10);
        int int20 = collatzConjecture0.nextNumber(73);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 220 + "'", int20 == 220);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(55);
        int int12 = collatzConjecture0.nextNumber(322);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(125);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 166 + "'", int10 == 166);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 161 + "'", int12 == 161);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(160);
        int int20 = collatzConjecture0.nextNumber(29);
        int int22 = collatzConjecture0.nextNumber(2);
        int int24 = collatzConjecture0.nextNumber((-1));
        int int26 = collatzConjecture0.nextNumber(110);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 88 + "'", int20 == 88);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 55 + "'", int26 == 55);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(38);
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber(2);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(100);
        int int26 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(20);
        int int30 = collatzConjecture0.nextNumber(292);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 146 + "'", int30 == 146);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(160);
        int int20 = collatzConjecture0.nextNumber(29);
        int int22 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(137);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 88 + "'", int20 == 88);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '4');
        int int20 = collatzConjecture0.nextNumber(34);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(16);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 17 + "'", int20 == 17);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(160);
        int int20 = collatzConjecture0.nextNumber(29);
        int int22 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(38);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 88 + "'", int20 == 88);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 10);
        int int24 = collatzConjecture0.nextNumber((int) (byte) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(76);
        java.lang.Class<?> wildcardClass5 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(17);
        int int20 = collatzConjecture0.nextNumber((int) 'a');
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber(2);
        int int20 = collatzConjecture0.nextNumber(160);
        int int22 = collatzConjecture0.nextNumber(53);
        int int24 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(4);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 80 + "'", int20 == 80);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 160 + "'", int22 == 160);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 73 + "'", int24 == 73);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(10);
        int int16 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(55);
        int int22 = collatzConjecture0.nextNumber(58);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber(376);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(80);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(376);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 188 + "'", int8 == 188);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(53);
        int int22 = collatzConjecture0.nextNumber(322);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 161 + "'", int22 == 161);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber(19);
        int int10 = collatzConjecture0.nextNumber(71);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 58 + "'", int8 == 58);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 214 + "'", int10 == 214);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        int int14 = collatzConjecture0.nextNumber(11);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(4);
        int int20 = collatzConjecture0.nextNumber(22);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        int int16 = collatzConjecture0.nextNumber((int) '4');
        int int18 = collatzConjecture0.nextNumber(25);
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        int int22 = collatzConjecture0.nextNumber(11);
        int int24 = collatzConjecture0.nextNumber((int) (short) 1);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 34 + "'", int22 == 34);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        int int14 = collatzConjecture0.nextNumber(19);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(25);
        int int20 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(100);
        int int24 = collatzConjecture0.nextNumber(106);
        int int26 = collatzConjecture0.nextNumber((-1));
        int int28 = collatzConjecture0.nextNumber(58);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 29 + "'", int28 == 29);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(10);
        int int16 = collatzConjecture0.nextNumber((-2));
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        int int22 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(13);
        int int26 = collatzConjecture0.nextNumber(88);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(5);
        int int30 = collatzConjecture0.nextNumber((int) (short) 0);
        java.lang.Class<?> wildcardClass31 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 44 + "'", int26 == 44);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int20 = collatzConjecture0.nextNumber(4);
        int int22 = collatzConjecture0.nextNumber((-2));
        int int24 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(11);
        int int28 = collatzConjecture0.nextNumber((int) '4');
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 160 + "'", int24 == 160);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 26 + "'", int28 == 26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(103);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(50);
        int int16 = collatzConjecture0.nextNumber(47);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(214);
        int int20 = collatzConjecture0.nextNumber(16);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 142 + "'", int16 == 142);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        int int14 = collatzConjecture0.nextNumber(0);
        int int16 = collatzConjecture0.nextNumber(83);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(44);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 250 + "'", int16 == 250);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '#');
        int int20 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(80);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        int int16 = collatzConjecture0.nextNumber(13);
        int int18 = collatzConjecture0.nextNumber(44);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(166);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(17);
        int int24 = collatzConjecture0.nextNumber(50);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(220);
        int int6 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        int int20 = collatzConjecture0.nextNumber((int) 'a');
        int int22 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int24 = collatzConjecture0.nextNumber(76);
        int int26 = collatzConjecture0.nextNumber(376);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(16);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 38 + "'", int24 == 38);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 188 + "'", int26 == 188);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(44);
        int int14 = collatzConjecture0.nextNumber(125);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        int int18 = collatzConjecture0.nextNumber(47);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 142 + "'", int18 == 142);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(10);
        int int16 = collatzConjecture0.nextNumber(13);
        int int18 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(17);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(182);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber(146);
        int int12 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(322);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 73 + "'", int10 == 73);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(20);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(142);
        int int20 = collatzConjecture0.nextNumber(274);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 137 + "'", int20 == 137);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) '#');
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(146);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int16 = collatzConjecture0.nextNumber(220);
        int int18 = collatzConjecture0.nextNumber(110);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 110 + "'", int16 == 110);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55 + "'", int18 == 55);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '#');
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        int int18 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 73 + "'", int8 == 73);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(58);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(310);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int18 = collatzConjecture0.nextNumber(1);
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        int int14 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(220);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 73 + "'", int14 == 73);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) ' ');
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(322);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(250);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(106);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        int int20 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(220);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int18 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(110);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(58);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(166);
        int int16 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(376);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) ' ');
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 146 + "'", int16 == 146);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(166);
        int int16 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(376);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(55);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 146 + "'", int16 == 146);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int16 = collatzConjecture0.nextNumber(16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(376);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber((-1));
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(160);
        int int12 = collatzConjecture0.nextNumber(34);
        int int14 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        int int18 = collatzConjecture0.nextNumber(17);
        int int20 = collatzConjecture0.nextNumber(11);
        int int22 = collatzConjecture0.nextNumber(188);
        int int24 = collatzConjecture0.nextNumber(242);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 76 + "'", int14 == 76);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 34 + "'", int20 == 34);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 94 + "'", int22 == 94);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 121 + "'", int24 == 121);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '4');
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        int int18 = collatzConjecture0.nextNumber(22);
        int int20 = collatzConjecture0.nextNumber((int) 'a');
        int int22 = collatzConjecture0.nextNumber((int) (short) -1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int24 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(484);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(146);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 0);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(4);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(166);
        int int20 = collatzConjecture0.nextNumber(40);
        int int22 = collatzConjecture0.nextNumber(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int24 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(71);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
        int int22 = collatzConjecture0.nextNumber(110);
        int int24 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) '4');
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 55 + "'", int22 == 55);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber(8);
        int int10 = collatzConjecture0.nextNumber(1);
        int int12 = collatzConjecture0.nextNumber(364);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 182 + "'", int12 == 182);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(250);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(214);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 107 + "'", int16 == 107);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(188);
        int int18 = collatzConjecture0.nextNumber(80);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(376);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(22);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(161);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(206);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(100);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(292);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber(160);
        int int26 = collatzConjecture0.nextNumber((-1));
        int int28 = collatzConjecture0.nextNumber(71);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 214 + "'", int28 == 214);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        int int18 = collatzConjecture0.nextNumber(10);
        int int20 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(13);
        int int26 = collatzConjecture0.nextNumber(121);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 364 + "'", int26 == 364);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(5);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(376);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int20 = collatzConjecture0.nextNumber(76);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(142);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(4);
        int int26 = collatzConjecture0.nextNumber(412);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 38 + "'", int20 == 38);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 206 + "'", int26 == 206);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(160);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(73);
        int int18 = collatzConjecture0.nextNumber((int) (short) 100);
        int int20 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(13);
        int int24 = collatzConjecture0.nextNumber(364);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 182 + "'", int24 == 182);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        int int14 = collatzConjecture0.nextNumber(11);
        int int16 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(1);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 73 + "'", int16 == 73);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(38);
        int int20 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(22);
        int int24 = collatzConjecture0.nextNumber(8);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(10);
        int int16 = collatzConjecture0.nextNumber(13);
        int int18 = collatzConjecture0.nextNumber(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(160);
        int int12 = collatzConjecture0.nextNumber(34);
        int int14 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(322);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 76 + "'", int14 == 76);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
        int int22 = collatzConjecture0.nextNumber(110);
        int int24 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) '4');
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 55 + "'", int22 == 55);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(38);
        int int14 = collatzConjecture0.nextNumber(484);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 242 + "'", int14 == 242);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(160);
        int int12 = collatzConjecture0.nextNumber(34);
        int int14 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        int int18 = collatzConjecture0.nextNumber(17);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 76 + "'", int14 == 76);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 10);
        int int20 = collatzConjecture0.nextNumber(94);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(58);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 47 + "'", int20 == 47);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(5);
        int int6 = collatzConjecture0.nextNumber(8);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(10);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) '4');
        int int18 = collatzConjecture0.nextNumber(1);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(166);
        int int14 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        int int14 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(220);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 73 + "'", int14 == 73);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        int int18 = collatzConjecture0.nextNumber(80);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(73);
        int int22 = collatzConjecture0.nextNumber(50);
        int int24 = collatzConjecture0.nextNumber(364);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 182 + "'", int24 == 182);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass7 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(20);
        int int18 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(83);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(20);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber(8);
        int int22 = collatzConjecture0.nextNumber((int) (short) -1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) (short) -1);
        int int12 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber(17);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(100);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(53);
        int int24 = collatzConjecture0.nextNumber((int) (short) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(188);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(166);
        int int20 = collatzConjecture0.nextNumber(364);
        int int22 = collatzConjecture0.nextNumber(58);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 182 + "'", int20 == 182);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(146);
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(100);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int22 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(106);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        int int14 = collatzConjecture0.nextNumber(125);
        int int16 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(58);
        int int22 = collatzConjecture0.nextNumber(19);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 58 + "'", int22 == 58);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(20);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 80 + "'", int12 == 80);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(25);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(44);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(58);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(10);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(5);
        int int22 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(47);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        int int18 = collatzConjecture0.nextNumber(22);
        int int20 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(29);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(4);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(292);
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        int int18 = collatzConjecture0.nextNumber(22);
        int int20 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(161);
        int int24 = collatzConjecture0.nextNumber(206);
        int int26 = collatzConjecture0.nextNumber(94);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 103 + "'", int24 == 103);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 47 + "'", int26 == 47);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        int int18 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(44);
        int int22 = collatzConjecture0.nextNumber(34);
        int int24 = collatzConjecture0.nextNumber(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 146 + "'", int18 == 146);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 17 + "'", int22 == 17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 142 + "'", int24 == 142);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(160);
        int int20 = collatzConjecture0.nextNumber(29);
        int int22 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) ' ');
        int int26 = collatzConjecture0.nextNumber(166);
        int int28 = collatzConjecture0.nextNumber(110);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 88 + "'", int20 == 88);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 83 + "'", int26 == 83);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 55 + "'", int28 == 55);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int24 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(94);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(53);
        int int18 = collatzConjecture0.nextNumber((-2));
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        int int22 = collatzConjecture0.nextNumber(47);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 142 + "'", int22 == 142);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(146);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(188);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(142);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(100);
        int int18 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(1);
        int int14 = collatzConjecture0.nextNumber((int) '#');
        int int16 = collatzConjecture0.nextNumber(73);
        int int18 = collatzConjecture0.nextNumber(71);
        int int20 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 106 + "'", int14 == 106);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 214 + "'", int18 == 214);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 88 + "'", int20 == 88);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(125);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        int int20 = collatzConjecture0.nextNumber(250);
        int int22 = collatzConjecture0.nextNumber(5);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 125 + "'", int20 == 125);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(8);
        int int24 = collatzConjecture0.nextNumber(55);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 166 + "'", int24 == 166);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber(0);
        int int22 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(16);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 73 + "'", int22 == 73);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(26);
        int int14 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        int int18 = collatzConjecture0.nextNumber(40);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(160);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        int int14 = collatzConjecture0.nextNumber(412);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 206 + "'", int14 == 206);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(2);
        int int20 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int24 = collatzConjecture0.nextNumber(188);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(25);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 94 + "'", int24 == 94);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(17);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(55);
        int int10 = collatzConjecture0.nextNumber(110);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 55 + "'", int10 == 55);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(55);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(250);
        int int16 = collatzConjecture0.nextNumber(107);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(106);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 125 + "'", int14 == 125);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 322 + "'", int16 == 322);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(250);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(76);
        int int24 = collatzConjecture0.nextNumber(107);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 322 + "'", int24 == 322);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int16 = collatzConjecture0.nextNumber((int) ' ');
        int int18 = collatzConjecture0.nextNumber((int) 'a');
        int int20 = collatzConjecture0.nextNumber((int) ' ');
        int int22 = collatzConjecture0.nextNumber(5);
        int int24 = collatzConjecture0.nextNumber(40);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(125);
        int int28 = collatzConjecture0.nextNumber(1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292 + "'", int18 == 292);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(100);
        int int26 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(20);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(100);
        int int32 = collatzConjecture0.nextNumber(322);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 161 + "'", int32 == 161);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        int int18 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(44);
        int int22 = collatzConjecture0.nextNumber(34);
        int int24 = collatzConjecture0.nextNumber(88);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 146 + "'", int18 == 146);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 17 + "'", int22 == 17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 44 + "'", int24 == 44);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(55);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) '4');
        int int22 = collatzConjecture0.nextNumber(125);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 376 + "'", int22 == 376);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        int int16 = collatzConjecture0.nextNumber(13);
        int int18 = collatzConjecture0.nextNumber(125);
        int int20 = collatzConjecture0.nextNumber(161);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 376 + "'", int18 == 376);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 484 + "'", int20 == 484);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        int int16 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(292);
        int int18 = collatzConjecture0.nextNumber(76);
        int int20 = collatzConjecture0.nextNumber(20);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(83);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(55);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) ' ');
        int int30 = collatzConjecture0.nextNumber(161);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 484 + "'", int30 == 484);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(73);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        int int18 = collatzConjecture0.nextNumber(10);
        int int20 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(88);
        int int26 = collatzConjecture0.nextNumber(52);
        int int28 = collatzConjecture0.nextNumber(76);
        int int30 = collatzConjecture0.nextNumber(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 26 + "'", int26 == 26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 38 + "'", int28 == 38);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '4');
        int int20 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(2);
        int int24 = collatzConjecture0.nextNumber(26);
        int int26 = collatzConjecture0.nextNumber(188);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 94 + "'", int26 == 94);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber(2);
        int int20 = collatzConjecture0.nextNumber(160);
        int int22 = collatzConjecture0.nextNumber(214);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 80 + "'", int20 == 80);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 107 + "'", int22 == 107);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(292);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int22 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(50);
        int int26 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '#');
        int int30 = collatzConjecture0.nextNumber(110);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 50 + "'", int26 == 50);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 55 + "'", int30 == 55);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(76);
        int int22 = collatzConjecture0.nextNumber(26);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 13 + "'", int22 == 13);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        int int12 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(22);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(121);
        int int20 = collatzConjecture0.nextNumber(1);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        int int20 = collatzConjecture0.nextNumber(250);
        int int22 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int24 = collatzConjecture0.nextNumber(214);
        int int26 = collatzConjecture0.nextNumber(5);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 125 + "'", int20 == 125);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 107 + "'", int24 == 107);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(91);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        int int18 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(5);
        int int22 = collatzConjecture0.nextNumber((int) ' ');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(73);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) '#');
        int int14 = collatzConjecture0.nextNumber(17);
        int int16 = collatzConjecture0.nextNumber(146);
        int int18 = collatzConjecture0.nextNumber(110);
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 73 + "'", int16 == 73);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55 + "'", int18 == 55);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(53);
        int int18 = collatzConjecture0.nextNumber((-2));
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(26);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int10 = collatzConjecture0.nextNumber(25);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 76 + "'", int10 == 76);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(88);
        int int12 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int16 = collatzConjecture0.nextNumber((int) ' ');
        int int18 = collatzConjecture0.nextNumber(364);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 182 + "'", int18 == 182);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        int int18 = collatzConjecture0.nextNumber(292);
        int int20 = collatzConjecture0.nextNumber(142);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(25);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 146 + "'", int18 == 146);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 71 + "'", int20 == 71);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 142 + "'", int12 == 142);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        int int14 = collatzConjecture0.nextNumber((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(26);
        int int18 = collatzConjecture0.nextNumber(16);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(25);
        int int16 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(137);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(100);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int20 = collatzConjecture0.nextNumber(160);
        int int22 = collatzConjecture0.nextNumber(44);
        int int24 = collatzConjecture0.nextNumber(364);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(412);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 80 + "'", int20 == 80);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 182 + "'", int24 == 182);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(292);
        int int24 = collatzConjecture0.nextNumber(13);
        int int26 = collatzConjecture0.nextNumber(91);
        int int28 = collatzConjecture0.nextNumber(71);
        int int30 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.lang.Class<?> wildcardClass33 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 274 + "'", int26 == 274);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 214 + "'", int28 == 214);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 83 + "'", int30 == 83);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(40);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 25 + "'", int20 == 25);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(47);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(166);
        int int16 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(376);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(55);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 146 + "'", int16 == 146);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(100);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(19);
        int int20 = collatzConjecture0.nextNumber(1);
        int int22 = collatzConjecture0.nextNumber(71);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(466);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 214 + "'", int22 == 214);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(73);
        int int16 = collatzConjecture0.nextNumber(20);
        int int18 = collatzConjecture0.nextNumber(17);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(182);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(38);
        int int20 = collatzConjecture0.nextNumber(220);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 110 + "'", int20 == 110);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(100);
        int int24 = collatzConjecture0.nextNumber((int) (short) 10);
        int int26 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 160 + "'", int26 == 160);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(73);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(22);
        int int24 = collatzConjecture0.nextNumber(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        int int16 = collatzConjecture0.nextNumber(53);
        int int18 = collatzConjecture0.nextNumber(40);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(73);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(8);
        int int22 = collatzConjecture0.nextNumber(412);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 206 + "'", int22 == 206);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int24 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(19);
        int int32 = collatzConjecture0.nextNumber(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 142 + "'", int32 == 142);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(44);
        int int14 = collatzConjecture0.nextNumber(125);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        int int18 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(52);
        int int22 = collatzConjecture0.nextNumber(11);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 34 + "'", int22 == 34);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber(5);
        int int22 = collatzConjecture0.nextNumber(25);
        int int24 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(26);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 76 + "'", int22 == 76);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(160);
        int int20 = collatzConjecture0.nextNumber(29);
        int int22 = collatzConjecture0.nextNumber(2);
        int int24 = collatzConjecture0.nextNumber((-1));
        int int26 = collatzConjecture0.nextNumber(40);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(17);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(103);
        java.lang.Class<?> wildcardClass31 = intList30.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 88 + "'", int20 == 88);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(20);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(88);
        int int12 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(182);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(76);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(100);
        int int12 = collatzConjecture0.nextNumber((int) (short) 10);
        int int14 = collatzConjecture0.nextNumber(412);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 206 + "'", int14 == 206);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(10);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(53);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(10);
        int int22 = collatzConjecture0.nextNumber(83);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 250 + "'", int22 == 250);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(16);
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(50);
        int int22 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(34);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(53);
        int int18 = collatzConjecture0.nextNumber((-2));
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(376);
        int int24 = collatzConjecture0.nextNumber(242);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 121 + "'", int24 == 121);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        int int18 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(76);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber(0);
        int int20 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(155);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 88 + "'", int20 == 88);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(214);
        int int28 = collatzConjecture0.nextNumber(376);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(322);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 188 + "'", int28 == 188);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        int int16 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber(146);
        int int10 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(55);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 73 + "'", int8 == 73);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 160 + "'", int10 == 160);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(146);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(73);
        int int10 = collatzConjecture0.nextNumber(80);
        int int12 = collatzConjecture0.nextNumber(83);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '4');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 250 + "'", int12 == 250);
        org.junit.Assert.assertNotNull(intList14);
    }
}

