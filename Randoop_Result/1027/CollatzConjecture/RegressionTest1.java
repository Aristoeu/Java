package CollatzConjecture;

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
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(20);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(10);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        int int22 = collatzConjecture0.nextNumber((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26 + "'", int22 == 26);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        int int20 = collatzConjecture0.nextNumber(13);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass5 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((-1));
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(13);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(38);
        int int14 = collatzConjecture0.nextNumber(125);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(55);
        int int16 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        int int22 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int24 = collatzConjecture0.nextNumber(5);
        int int26 = collatzConjecture0.nextNumber(8);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int10 = collatzConjecture0.nextNumber(5);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(1);
        int int14 = collatzConjecture0.nextNumber((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(22);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber(2);
        int int14 = collatzConjecture0.nextNumber(22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        int int22 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(47);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 50 + "'", int26 == 50);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(55);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(55);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(76);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        int int22 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int24 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(25);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        int int20 = collatzConjecture0.nextNumber(110);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 55 + "'", int20 == 55);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(2);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(38);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(40);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        int int18 = collatzConjecture0.nextNumber((-1));
        int int20 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(146);
        int int16 = collatzConjecture0.nextNumber(26);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(58);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        int int10 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int12 = collatzConjecture0.nextNumber(4);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(100);
        int int18 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((-1));
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        int int20 = collatzConjecture0.nextNumber(166);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 83 + "'", int20 == 83);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(2);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(38);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) -1);
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
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) ' ');
        int int6 = collatzConjecture0.nextNumber(4);
        int int8 = collatzConjecture0.nextNumber(11);
        int int10 = collatzConjecture0.nextNumber(160);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        int int22 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int24 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((-2));
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(292);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(73);
        int int28 = collatzConjecture0.nextNumber(38);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber((int) 'a');
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 292 + "'", int8 == 292);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(20);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '#');
        int int20 = collatzConjecture0.nextNumber(13);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass7 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        int int26 = collatzConjecture0.nextNumber((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber(13);
        int int10 = collatzConjecture0.nextNumber(8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(20);
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (short) 10);
        int int12 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(40);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 76 + "'", int22 == 76);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) ' ');
        int int28 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass31 = intList30.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(250);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 125 + "'", int14 == 125);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        int int22 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(110);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
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
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(73);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(55);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(110);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(38);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(13);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(94);
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        int int20 = collatzConjecture0.nextNumber(19);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 110 + "'", int18 == 110);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 58 + "'", int20 == 58);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        int int14 = collatzConjecture0.nextNumber(292);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        int int22 = collatzConjecture0.nextNumber(50);
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
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 80 + "'", int12 == 80);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = intList4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(94);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
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
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(10);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(100);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(17);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 76 + "'", int12 == 76);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(20);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber((-2));
        int int10 = collatzConjecture0.nextNumber((-2));
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(106);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(160);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(188);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(47);
        int int22 = collatzConjecture0.nextNumber(220);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 110 + "'", int22 == 110);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
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
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        int int20 = collatzConjecture0.nextNumber(76);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292 + "'", int18 == 292);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 38 + "'", int20 == 38);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(10);
        int int16 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(110);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(292);
        int int12 = collatzConjecture0.nextNumber(4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        int int20 = collatzConjecture0.nextNumber((int) (short) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        int int18 = collatzConjecture0.nextNumber((-1));
        int int20 = collatzConjecture0.nextNumber(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((-2));
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(8);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
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
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(44);
        int int14 = collatzConjecture0.nextNumber(125);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(100);
        int int18 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        int int22 = collatzConjecture0.nextNumber(292);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 146 + "'", int22 == 146);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber(17);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(166);
        int int14 = collatzConjecture0.nextNumber(0);
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        int int18 = collatzConjecture0.nextNumber((-1));
        int int20 = collatzConjecture0.nextNumber((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int14 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(8);
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(53);
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(88);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(76);
        int int12 = collatzConjecture0.nextNumber(166);
        int int14 = collatzConjecture0.nextNumber(250);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 125 + "'", int14 == 125);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        int int24 = collatzConjecture0.nextNumber(50);
        int int26 = collatzConjecture0.nextNumber(166);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 83 + "'", int26 == 83);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(44);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(73);
        int int16 = collatzConjecture0.nextNumber(38);
        int int18 = collatzConjecture0.nextNumber(34);
        int int20 = collatzConjecture0.nextNumber(220);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 110 + "'", int20 == 110);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        int int28 = collatzConjecture0.nextNumber(292);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 146 + "'", int28 == 146);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(73);
        int int18 = collatzConjecture0.nextNumber(0);
        int int20 = collatzConjecture0.nextNumber(88);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 44 + "'", int20 == 44);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(160);
        int int14 = collatzConjecture0.nextNumber(80);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 80 + "'", int12 == 80);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 40 + "'", int14 == 40);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(38);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        int int16 = collatzConjecture0.nextNumber(13);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(220);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(16);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        int int24 = collatzConjecture0.nextNumber(4);
        int int26 = collatzConjecture0.nextNumber(38);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        int int20 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((-2));
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
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(73);
        int int16 = collatzConjecture0.nextNumber(38);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        int int18 = collatzConjecture0.nextNumber((-1));
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        int int20 = collatzConjecture0.nextNumber(16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((-2));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber(80);
        int int18 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) ' ');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(34);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(110);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(5);
        java.lang.Class<?> wildcardClass5 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(55);
        int int16 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(17);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(146);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 80 + "'", int20 == 80);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(2);
        int int10 = collatzConjecture0.nextNumber(106);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(292);
        int int16 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.lang.Class<?> wildcardClass5 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(22);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(188);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(73);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) ' ');
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 73 + "'", int8 == 73);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int24 = collatzConjecture0.nextNumber((-1));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(55);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(146);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int16 = collatzConjecture0.nextNumber(220);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 110 + "'", int16 == 110);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(55);
        int int14 = collatzConjecture0.nextNumber(52);
        int int16 = collatzConjecture0.nextNumber(16);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26 + "'", int14 == 26);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(0);
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
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(88);
        int int12 = collatzConjecture0.nextNumber((-1));
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(106);
        int int20 = collatzConjecture0.nextNumber(250);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 125 + "'", int20 == 125);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber((int) 'a');
        int int14 = collatzConjecture0.nextNumber(26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(125);
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
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        int int14 = collatzConjecture0.nextNumber(11);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) ' ');
        int int6 = collatzConjecture0.nextNumber(4);
        int int8 = collatzConjecture0.nextNumber(11);
        int int10 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        int int26 = collatzConjecture0.nextNumber(55);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 166 + "'", int26 == 166);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        int int22 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(166);
        int int26 = collatzConjecture0.nextNumber((int) ' ');
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(73);
        int int18 = collatzConjecture0.nextNumber(110);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55 + "'", int18 == 55);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(8);
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
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber((int) (byte) -1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 44 + "'", int26 == 44);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(26);
        int int14 = collatzConjecture0.nextNumber((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(25);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        int int22 = collatzConjecture0.nextNumber(55);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 110 + "'", int18 == 110);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 166 + "'", int22 == 166);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(5);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        int int18 = collatzConjecture0.nextNumber(26);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(58);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(166);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(146);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) ' ');
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(26);
        int int18 = collatzConjecture0.nextNumber(220);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 110 + "'", int18 == 110);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (short) -1);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        int int20 = collatzConjecture0.nextNumber((int) 'a');
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(10);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(110);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 55 + "'", int12 == 55);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 83 + "'", int14 == 83);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        int int22 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int24 = collatzConjecture0.nextNumber(5);
        int int26 = collatzConjecture0.nextNumber(8);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(16);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(4);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(34);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(125);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(16);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 160 + "'", int6 == 160);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        int int26 = collatzConjecture0.nextNumber(55);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 166 + "'", int26 == 166);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(25);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) -1);
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
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) ' ');
        int int6 = collatzConjecture0.nextNumber((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 160 + "'", int6 == 160);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber((int) ' ');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(4);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((-1));
        int int12 = collatzConjecture0.nextNumber(16);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((-2));
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
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(142);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(29);
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
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(40);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(34);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(50);
        int int16 = collatzConjecture0.nextNumber(47);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 142 + "'", int16 == 142);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(40);
        int int16 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(26);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(107);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
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
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        int int20 = collatzConjecture0.nextNumber(52);
        int int22 = collatzConjecture0.nextNumber(50);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 83 + "'", int14 == 83);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26 + "'", int20 == 26);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        int int10 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(20);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        int int20 = collatzConjecture0.nextNumber(76);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(1);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292 + "'", int18 == 292);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 38 + "'", int20 == 38);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        int int14 = collatzConjecture0.nextNumber(0);
        int int16 = collatzConjecture0.nextNumber(83);
        int int18 = collatzConjecture0.nextNumber(166);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 250 + "'", int16 == 250);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 83 + "'", int18 == 83);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        int int22 = collatzConjecture0.nextNumber(19);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 58 + "'", int22 == 58);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(94);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(220);
        int int6 = collatzConjecture0.nextNumber(22);
        java.lang.Class<?> wildcardClass7 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        int int20 = collatzConjecture0.nextNumber(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        int int26 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(166);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(19);
        java.lang.Class<?> wildcardClass7 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 10);
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(13);
        int int22 = collatzConjecture0.nextNumber(29);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 88 + "'", int22 == 88);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        int int6 = collatzConjecture0.nextNumber(110);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber(13);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber((int) (short) 10);
        int int14 = collatzConjecture0.nextNumber(19);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(73);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        int int12 = collatzConjecture0.nextNumber(13);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(188);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(0);
        int int16 = collatzConjecture0.nextNumber(376);
        int int18 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 188 + "'", int16 == 188);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        int int20 = collatzConjecture0.nextNumber(1);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        int int22 = collatzConjecture0.nextNumber(29);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 88 + "'", int22 == 88);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(146);
        int int6 = collatzConjecture0.nextNumber(250);
        int int8 = collatzConjecture0.nextNumber(10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 125 + "'", int6 == 125);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(8);
        int int16 = collatzConjecture0.nextNumber(8);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 146 + "'", int20 == 146);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        int int14 = collatzConjecture0.nextNumber(125);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(376);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int18 = collatzConjecture0.nextNumber((int) '4');
        int int20 = collatzConjecture0.nextNumber(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(17);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        int int16 = collatzConjecture0.nextNumber(4);
        int int18 = collatzConjecture0.nextNumber(16);
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
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        int int22 = collatzConjecture0.nextNumber((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        int int22 = collatzConjecture0.nextNumber((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(0);
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
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 146 + "'", int20 == 146);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(16);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        int int10 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber(220);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 110 + "'", int14 == 110);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        int int16 = collatzConjecture0.nextNumber(4);
        int int18 = collatzConjecture0.nextNumber(16);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int18 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(34);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        int int22 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(110);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber(146);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 73 + "'", int10 == 73);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass7 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 88 + "'", int4 == 88);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        int int22 = collatzConjecture0.nextNumber((-1));
        int int24 = collatzConjecture0.nextNumber(11);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(188);
        int int18 = collatzConjecture0.nextNumber(34);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 58 + "'", int24 == 58);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(2);
        int int10 = collatzConjecture0.nextNumber(106);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(292);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(40);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(38);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 142 + "'", int18 == 142);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        int int24 = collatzConjecture0.nextNumber((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 80 + "'", int20 == 80);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 160 + "'", int22 == 160);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(8);
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(188);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(34);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(29);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        int int22 = collatzConjecture0.nextNumber(73);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 220 + "'", int22 == 220);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '4');
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(11);
        int int22 = collatzConjecture0.nextNumber(11);
        int int24 = collatzConjecture0.nextNumber(250);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 34 + "'", int22 == 34);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 125 + "'", int24 == 125);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(2);
        int int10 = collatzConjecture0.nextNumber(106);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(16);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(8);
        int int16 = collatzConjecture0.nextNumber(110);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 55 + "'", int16 == 55);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(1);
        int int14 = collatzConjecture0.nextNumber((int) '#');
        int int16 = collatzConjecture0.nextNumber(125);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 106 + "'", int14 == 106);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 376 + "'", int16 == 376);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(40);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(100);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(100);
        int int12 = collatzConjecture0.nextNumber((int) (short) 10);
        int int14 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(52);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(55);
        int int14 = collatzConjecture0.nextNumber(52);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26 + "'", int14 == 26);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(73);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) '#');
        int int14 = collatzConjecture0.nextNumber(17);
        int int16 = collatzConjecture0.nextNumber(146);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 73 + "'", int16 == 73);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(73);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
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
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(10);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(19);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(55);
        int int22 = collatzConjecture0.nextNumber(166);
        int int24 = collatzConjecture0.nextNumber(5);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 83 + "'", int22 == 83);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(100);
        int int12 = collatzConjecture0.nextNumber(110);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 55 + "'", int12 == 55);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(55);
        int int22 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(44);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 83 + "'", int22 == 83);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(83);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int16 = collatzConjecture0.nextNumber(53);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int14 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 83 + "'", int14 == 83);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(4);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(188);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(76);
        int int18 = collatzConjecture0.nextNumber(73);
        int int20 = collatzConjecture0.nextNumber(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        int int24 = collatzConjecture0.nextNumber(38);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int10 = collatzConjecture0.nextNumber(44);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(11);
        int int14 = collatzConjecture0.nextNumber(40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        int int26 = collatzConjecture0.nextNumber(5);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        int int20 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(83);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(40);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 250 + "'", int10 == 250);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(25);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
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
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '#');
        int int20 = collatzConjecture0.nextNumber(13);
        int int22 = collatzConjecture0.nextNumber(220);
        int int24 = collatzConjecture0.nextNumber((int) ' ');
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 110 + "'", int22 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((-2));
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
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(76);
        int int12 = collatzConjecture0.nextNumber(166);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber(13);
        int int10 = collatzConjecture0.nextNumber(8);
        int int12 = collatzConjecture0.nextNumber(19);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 58 + "'", int12 == 58);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber(73);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        int int22 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 146 + "'", int22 == 146);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber(146);
        int int10 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(55);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 73 + "'", int8 == 73);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 160 + "'", int10 == 160);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(13);
        int int12 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber(100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(146);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(160);
        int int14 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(220);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 80 + "'", int12 == 80);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(20);
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(55);
        int int14 = collatzConjecture0.nextNumber(52);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26 + "'", int14 == 26);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) (short) -1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) 'a');
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        int int24 = collatzConjecture0.nextNumber((int) (short) 1);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        int int18 = collatzConjecture0.nextNumber(34);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        int int22 = collatzConjecture0.nextNumber(58);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        int int26 = collatzConjecture0.nextNumber(214);
        int int28 = collatzConjecture0.nextNumber((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 107 + "'", int26 == 107);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(44);
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
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        int int20 = collatzConjecture0.nextNumber(11);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 110 + "'", int16 == 110);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55 + "'", int18 == 55);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 34 + "'", int20 == 34);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(20);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        int int22 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(110);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber(1);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(4);
        int int14 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(106);
        int int16 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int18 = collatzConjecture0.nextNumber(161);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 484 + "'", int18 == 484);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(47);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(0);
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
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        int int10 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(20);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(110);
        int int10 = collatzConjecture0.nextNumber(214);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 55 + "'", int8 == 55);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 107 + "'", int10 == 107);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(10);
        int int10 = collatzConjecture0.nextNumber(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(76);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(188);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(110);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        int int28 = collatzConjecture0.nextNumber((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        int int22 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(166);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26 + "'", int22 == 26);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(292);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(88);
        int int12 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(34);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(40);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(125);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 88 + "'", int4 == 88);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        int int22 = collatzConjecture0.nextNumber(73);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 220 + "'", int22 == 220);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(17);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(55);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) ' ');
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(29);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(242);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        int int28 = collatzConjecture0.nextNumber(4);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        int int22 = collatzConjecture0.nextNumber((int) ' ');
        int int24 = collatzConjecture0.nextNumber(106);
        int int26 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 76 + "'", int12 == 76);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int10 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(29);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(376);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(26);
        int int12 = collatzConjecture0.nextNumber(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 142 + "'", int12 == 142);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(52);
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
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        java.lang.Class<?> wildcardClass31 = intList30.getClass();
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 38 + "'", int22 == 38);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        int int20 = collatzConjecture0.nextNumber(166);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 83 + "'", int20 == 83);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        int int22 = collatzConjecture0.nextNumber((int) (short) 1);
        int int24 = collatzConjecture0.nextNumber(4);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(188);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(166);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(76);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 142 + "'", int18 == 142);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        int int20 = collatzConjecture0.nextNumber((-2));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber((int) 'a');
        int int14 = collatzConjecture0.nextNumber(26);
        int int16 = collatzConjecture0.nextNumber(19);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 58 + "'", int16 == 58);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(19);
        int int22 = collatzConjecture0.nextNumber((-1));
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(22);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 292 + "'", int8 == 292);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(88);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        int int22 = collatzConjecture0.nextNumber(110);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 55 + "'", int22 == 55);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '4');
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int10 = collatzConjecture0.nextNumber(25);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 76 + "'", int10 == 76);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26 + "'", int14 == 26);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        int int24 = collatzConjecture0.nextNumber(52);
        int int26 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(214);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 146 + "'", int20 == 146);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 26 + "'", int26 == 26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(0);
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
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(25);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(0);
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
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        int int10 = collatzConjecture0.nextNumber(13);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(38);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        int int26 = collatzConjecture0.nextNumber(40);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        int int20 = collatzConjecture0.nextNumber((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((-2));
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 106 + "'", int20 == 106);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(0);
        int int16 = collatzConjecture0.nextNumber((int) '4');
        int int18 = collatzConjecture0.nextNumber(25);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int6 = collatzConjecture0.nextNumber(4);
        java.lang.Class<?> wildcardClass7 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(55);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(76);
        int int22 = collatzConjecture0.nextNumber(26);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 13 + "'", int22 == 13);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(55);
        int int16 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(17);
        int int20 = collatzConjecture0.nextNumber((int) '4');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26 + "'", int20 == 26);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(0);
        int int16 = collatzConjecture0.nextNumber(376);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 188 + "'", int16 == 188);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292 + "'", int18 == 292);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        int int16 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(22);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 83 + "'", int16 == 83);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        int int22 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(83);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 146 + "'", int22 == 146);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(76);
        int int18 = collatzConjecture0.nextNumber((int) (short) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 38 + "'", int16 == 38);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(166);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        int int20 = collatzConjecture0.nextNumber((int) (short) 10);
        int int22 = collatzConjecture0.nextNumber(1);
        int int24 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 292 + "'", int24 == 292);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(100);
        int int16 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(16);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(250);
        int int16 = collatzConjecture0.nextNumber(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 125 + "'", int14 == 125);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

