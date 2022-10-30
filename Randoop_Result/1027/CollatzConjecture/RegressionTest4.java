package CollatzConjecture;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        int int22 = collatzConjecture0.nextNumber((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        int int10 = collatzConjecture0.nextNumber(16);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(80);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(17);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(121);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(55);
        int int22 = collatzConjecture0.nextNumber(242);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 121 + "'", int22 == 121);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(53);
        int int22 = collatzConjecture0.nextNumber(250);
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
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 125 + "'", int22 == 125);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        int int20 = collatzConjecture0.nextNumber(188);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 94 + "'", int20 == 94);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) ' ');
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
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
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) 'a');
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(80);
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
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(50);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int22 = collatzConjecture0.nextNumber(2);
        int int24 = collatzConjecture0.nextNumber(292);
        int int26 = collatzConjecture0.nextNumber(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 146 + "'", int24 == 146);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(73);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        int int6 = collatzConjecture0.nextNumber(292);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(55);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 146 + "'", int6 == 146);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(1);
        int int26 = collatzConjecture0.nextNumber((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        int int24 = collatzConjecture0.nextNumber(29);
        int int26 = collatzConjecture0.nextNumber(166);
        int int28 = collatzConjecture0.nextNumber((int) ' ');
        int int30 = collatzConjecture0.nextNumber(161);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 88 + "'", int24 == 88);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 83 + "'", int26 == 83);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 484 + "'", int30 == 484);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        int int16 = collatzConjecture0.nextNumber(125);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 376 + "'", int16 == 376);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        int int10 = collatzConjecture0.nextNumber(73);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(25);
        int int14 = collatzConjecture0.nextNumber(0);
        int int16 = collatzConjecture0.nextNumber(38);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 76 + "'", int12 == 76);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 110 + "'", int24 == 110);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        int int22 = collatzConjecture0.nextNumber(146);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 73 + "'", int22 == 73);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(38);
        int int14 = collatzConjecture0.nextNumber(71);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 214 + "'", int14 == 214);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(88);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 73 + "'", int8 == 73);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int14 = collatzConjecture0.nextNumber(214);
        int int16 = collatzConjecture0.nextNumber(0);
        int int18 = collatzConjecture0.nextNumber(310);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 107 + "'", int14 == 107);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 155 + "'", int18 == 155);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(26);
        int int24 = collatzConjecture0.nextNumber(53);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 160 + "'", int24 == 160);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        int int22 = collatzConjecture0.nextNumber(220);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(100);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 110 + "'", int22 == 110);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((-1));
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(76);
        int int16 = collatzConjecture0.nextNumber(2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 38 + "'", int14 == 38);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(110);
        int int24 = collatzConjecture0.nextNumber(91);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 274 + "'", int24 == 274);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(242);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        int int24 = collatzConjecture0.nextNumber(44);
        int int26 = collatzConjecture0.nextNumber(19);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 58 + "'", int26 == 58);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber(110);
        int int26 = collatzConjecture0.nextNumber(16);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 55 + "'", int24 == 55);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        int int24 = collatzConjecture0.nextNumber(58);
        int int26 = collatzConjecture0.nextNumber((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        int int24 = collatzConjecture0.nextNumber(29);
        int int26 = collatzConjecture0.nextNumber((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((-1));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 88 + "'", int24 == 88);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(53);
        int int20 = collatzConjecture0.nextNumber(83);
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber((int) 'a');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250 + "'", int20 == 250);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 292 + "'", int24 == 292);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(40);
        int int16 = collatzConjecture0.nextNumber((int) '4');
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(22);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int10 = collatzConjecture0.nextNumber(26);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(161);
        int int32 = collatzConjecture0.nextNumber((int) ' ');
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
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 16 + "'", int32 == 16);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(412);
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
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        int int22 = collatzConjecture0.nextNumber(80);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 40 + "'", int22 == 40);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(29);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        int int22 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(364);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 125 + "'", int20 == 125);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 146 + "'", int20 == 146);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        int int14 = collatzConjecture0.nextNumber(44);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        int int28 = collatzConjecture0.nextNumber(484);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 242 + "'", int28 == 242);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(26);
        int int24 = collatzConjecture0.nextNumber(58);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber((-2));
        int int12 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(52);
        int int18 = collatzConjecture0.nextNumber(146);
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(103);
        int int24 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(26);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 73 + "'", int18 == 73);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 83 + "'", int24 == 83);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(5);
        int int6 = collatzConjecture0.nextNumber(8);
        int int8 = collatzConjecture0.nextNumber(11);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        int int24 = collatzConjecture0.nextNumber(29);
        int int26 = collatzConjecture0.nextNumber(166);
        int int28 = collatzConjecture0.nextNumber((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 88 + "'", int24 == 88);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 83 + "'", int26 == 83);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        int int20 = collatzConjecture0.nextNumber(146);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 73 + "'", int20 == 73);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(73);
        int int24 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(34);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        int int24 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        int int24 = collatzConjecture0.nextNumber((int) '#');
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 106 + "'", int24 == 106);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(322);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(121);
        int int12 = collatzConjecture0.nextNumber(188);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 94 + "'", int12 == 94);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        int int26 = collatzConjecture0.nextNumber(19);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 58 + "'", int26 == 58);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(40);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(55);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        int int22 = collatzConjecture0.nextNumber((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(376);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(29);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(107);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 322 + "'", int12 == 322);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(34);
        int int24 = collatzConjecture0.nextNumber(376);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 188 + "'", int24 == 188);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(38);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        int int20 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(83);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        int int14 = collatzConjecture0.nextNumber(0);
        int int16 = collatzConjecture0.nextNumber(83);
        int int18 = collatzConjecture0.nextNumber(0);
        int int20 = collatzConjecture0.nextNumber(5);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 250 + "'", int16 == 250);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(8);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(71);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(20);
        int int20 = collatzConjecture0.nextNumber((int) 'a');
        int int22 = collatzConjecture0.nextNumber((int) (short) 100);
        int int24 = collatzConjecture0.nextNumber((int) ' ');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(55);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(11);
        int int24 = collatzConjecture0.nextNumber(166);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 83 + "'", int24 == 83);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        int int28 = collatzConjecture0.nextNumber((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(161);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(5);
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
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        int int22 = collatzConjecture0.nextNumber(55);
        int int24 = collatzConjecture0.nextNumber(58);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 166 + "'", int22 == 166);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(5);
        int int10 = collatzConjecture0.nextNumber(10);
        int int12 = collatzConjecture0.nextNumber(100);
        int int14 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        int int14 = collatzConjecture0.nextNumber(11);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        int int18 = collatzConjecture0.nextNumber(11);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(322);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int12 = collatzConjecture0.nextNumber(166);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 13 + "'", int8 == 13);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(20);
        int int16 = collatzConjecture0.nextNumber((-2));
        int int18 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(80);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 106 + "'", int18 == 106);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) '#');
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
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        int int22 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(155);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 73 + "'", int22 == 73);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(188);
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
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(19);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 58 + "'", int10 == 58);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber(50);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber((-2));
        int int12 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(22);
        int int12 = collatzConjecture0.nextNumber(292);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(76);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        int int22 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(76);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(44);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        int int24 = collatzConjecture0.nextNumber(5);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        int int16 = collatzConjecture0.nextNumber(88);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 44 + "'", int16 == 44);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber(292);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        int int18 = collatzConjecture0.nextNumber(29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 88 + "'", int18 == 88);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        int int10 = collatzConjecture0.nextNumber((int) (byte) 0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(103);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        int int22 = collatzConjecture0.nextNumber(22);
        int int24 = collatzConjecture0.nextNumber((int) (short) 100);
        int int26 = collatzConjecture0.nextNumber(376);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 188 + "'", int26 == 188);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        int int10 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber((int) (short) 10);
        int int16 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(38);
        int int14 = collatzConjecture0.nextNumber(11);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        int int24 = collatzConjecture0.nextNumber(29);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 88 + "'", int24 == 88);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int12 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(161);
        int int16 = collatzConjecture0.nextNumber(73);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(110);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        int int24 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '4');
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(206);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(214);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertNotNull(intList6);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(58);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(188);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(47);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(214);
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
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        int int22 = collatzConjecture0.nextNumber(220);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(38);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 110 + "'", int22 == 110);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(94);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber(146);
        int int10 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(161);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 73 + "'", int8 == 73);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 160 + "'", int10 == 160);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(220);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber((-2));
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        int int28 = collatzConjecture0.nextNumber(19);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 58 + "'", int28 == 58);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        int int14 = collatzConjecture0.nextNumber(11);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        int int18 = collatzConjecture0.nextNumber(13);
        int int20 = collatzConjecture0.nextNumber(250);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 125 + "'", int20 == 125);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(40);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(83);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int24 = collatzConjecture0.nextNumber(0);
        int int26 = collatzConjecture0.nextNumber(94);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 47 + "'", int26 == 47);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber(376);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(80);
        int int12 = collatzConjecture0.nextNumber(364);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 188 + "'", int8 == 188);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 182 + "'", int12 == 182);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(242);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(106);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(73);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        int int20 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(125);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(80);
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
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(100);
        int int18 = collatzConjecture0.nextNumber((-1));
        int int20 = collatzConjecture0.nextNumber(233);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 700 + "'", int20 == 700);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 110 + "'", int24 == 110);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int12 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(161);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(26);
        int int18 = collatzConjecture0.nextNumber(88);
        int int20 = collatzConjecture0.nextNumber(188);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) 'a');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 94 + "'", int20 == 94);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        int int14 = collatzConjecture0.nextNumber(11);
        int int16 = collatzConjecture0.nextNumber(146);
        int int18 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(19);
        int int24 = collatzConjecture0.nextNumber((int) (short) 10);
        int int26 = collatzConjecture0.nextNumber(376);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 73 + "'", int16 == 73);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 188 + "'", int26 == 188);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(38);
        int int24 = collatzConjecture0.nextNumber(274);
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
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 137 + "'", int24 == 137);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(5);
        int int6 = collatzConjecture0.nextNumber(8);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(137);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(1);
        int int14 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(50);
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
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(146);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 0);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(4);
        int int18 = collatzConjecture0.nextNumber(11);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        int int26 = collatzConjecture0.nextNumber(125);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(80);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 376 + "'", int26 == 376);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        int int22 = collatzConjecture0.nextNumber(110);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 55 + "'", int22 == 55);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        int int22 = collatzConjecture0.nextNumber((int) '#');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 106 + "'", int22 == 106);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int18 = collatzConjecture0.nextNumber((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(188);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(22);
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
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        int int24 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) '4');
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 88 + "'", int24 == 88);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(10);
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
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(292);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int16 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(53);
        int int20 = collatzConjecture0.nextNumber(161);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 484 + "'", int20 == 484);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber((int) (byte) -1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int18 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        int int28 = collatzConjecture0.nextNumber(220);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 110 + "'", int28 == 110);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        int int22 = collatzConjecture0.nextNumber(146);
        int int24 = collatzConjecture0.nextNumber(161);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 73 + "'", int22 == 73);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 484 + "'", int24 == 484);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(142);
        int int26 = collatzConjecture0.nextNumber(91);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 274 + "'", int26 == 274);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(4);
        int int8 = collatzConjecture0.nextNumber(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(53);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 38 + "'", int8 == 38);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        int int22 = collatzConjecture0.nextNumber(274);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 137 + "'", int22 == 137);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(40);
        int int16 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(188);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(73);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(142);
        int int12 = collatzConjecture0.nextNumber(242);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 121 + "'", int12 == 121);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 10);
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
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(142);
        int int26 = collatzConjecture0.nextNumber(29);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 88 + "'", int26 == 88);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        int int30 = collatzConjecture0.nextNumber((int) '4');
        int int32 = collatzConjecture0.nextNumber(88);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26 + "'", int30 == 26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 44 + "'", int32 == 44);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(19);
        int int16 = collatzConjecture0.nextNumber(484);
        int int18 = collatzConjecture0.nextNumber(484);
        int int20 = collatzConjecture0.nextNumber(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 242 + "'", int16 == 242);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 242 + "'", int18 == 242);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26 + "'", int20 == 26);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        int int24 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(38);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        int int26 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        int int20 = collatzConjecture0.nextNumber(412);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(125);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 206 + "'", int20 == 206);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int18 = collatzConjecture0.nextNumber(8);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(91);
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
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(220);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (short) 10);
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
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber(364);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(376);
        int int14 = collatzConjecture0.nextNumber(73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 182 + "'", int8 == 182);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber(88);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(20);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 44 + "'", int8 == 44);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        int int30 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.lang.Class<?> wildcardClass33 = intList32.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(73);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) '#');
        int int14 = collatzConjecture0.nextNumber(17);
        int int16 = collatzConjecture0.nextNumber(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) '4');
        int int10 = collatzConjecture0.nextNumber((int) ' ');
        int int12 = collatzConjecture0.nextNumber(250);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 125 + "'", int12 == 125);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        int int24 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(214);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(274);
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
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(29);
        int int16 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        int int24 = collatzConjecture0.nextNumber((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(73);
        int int16 = collatzConjecture0.nextNumber(20);
        int int18 = collatzConjecture0.nextNumber(233);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 700 + "'", int18 == 700);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        int int28 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(155);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 76 + "'", int28 == 76);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(182);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(166);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 73 + "'", int6 == 73);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(73);
        int int16 = collatzConjecture0.nextNumber(38);
        int int18 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(47);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(188);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(25);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(146);
        int int6 = collatzConjecture0.nextNumber(250);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(206);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 125 + "'", int6 == 125);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        int int26 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(29);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        int int30 = collatzConjecture0.nextNumber(19);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(76);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 58 + "'", int30 == 58);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int22 = collatzConjecture0.nextNumber(47);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 142 + "'", int22 == 142);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        int int6 = collatzConjecture0.nextNumber(292);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(55);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(38);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 146 + "'", int6 == 146);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        int int24 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(220);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(8);
        int int24 = collatzConjecture0.nextNumber(242);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 121 + "'", int24 == 121);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        int int22 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(142);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 76 + "'", int22 == 76);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(1);
        int int14 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
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
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        int int26 = collatzConjecture0.nextNumber(125);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 376 + "'", int26 == 376);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(110);
        int int14 = collatzConjecture0.nextNumber(100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        int int24 = collatzConjecture0.nextNumber(103);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 310 + "'", int24 == 310);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        int int26 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(106);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 26 + "'", int26 == 26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        int int26 = collatzConjecture0.nextNumber(4);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 76 + "'", int22 == 76);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 58 + "'", int24 == 58);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int28 = collatzConjecture0.nextNumber(466);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 233 + "'", int28 == 233);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(160);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 80 + "'", int12 == 80);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        int int26 = collatzConjecture0.nextNumber((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber((-2));
        int int12 = collatzConjecture0.nextNumber(20);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber(364);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(146);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 182 + "'", int8 == 182);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        int int22 = collatzConjecture0.nextNumber(220);
        int int24 = collatzConjecture0.nextNumber(26);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 110 + "'", int22 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber(17);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(47);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int16 = collatzConjecture0.nextNumber(29);
        int int18 = collatzConjecture0.nextNumber(11);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(310);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 88 + "'", int16 == 88);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(25);
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
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(40);
        int int28 = collatzConjecture0.nextNumber((int) (short) -1);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(142);
        int int16 = collatzConjecture0.nextNumber(26);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) 'a');
        int int14 = collatzConjecture0.nextNumber(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(166);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(55);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(166);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        int int22 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(214);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(80);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
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
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(55);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        int int14 = collatzConjecture0.nextNumber((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(11);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(73);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        int int20 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(250);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 220 + "'", int20 == 220);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        int int26 = collatzConjecture0.nextNumber((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '4');
        int int18 = collatzConjecture0.nextNumber((int) '#');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 106 + "'", int18 == 106);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(80);
        int int26 = collatzConjecture0.nextNumber(20);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 0);
        int int12 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(29);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 220 + "'", int12 == 220);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(106);
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(250);
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
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(52);
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
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int20 = collatzConjecture0.nextNumber(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26 + "'", int20 == 26);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        int int10 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(20);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(16);
        int int18 = collatzConjecture0.nextNumber(50);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber((int) (short) -1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(80);
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
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        int int26 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        int int14 = collatzConjecture0.nextNumber(88);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(58);
        int int18 = collatzConjecture0.nextNumber(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber((-2));
        int int12 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(52);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        int int22 = collatzConjecture0.nextNumber(137);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(76);
        int int26 = collatzConjecture0.nextNumber(94);
        int int28 = collatzConjecture0.nextNumber((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 412 + "'", int22 == 412);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 47 + "'", int26 == 47);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        int int20 = collatzConjecture0.nextNumber(146);
        int int22 = collatzConjecture0.nextNumber(58);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 73 + "'", int20 == 73);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        int int20 = collatzConjecture0.nextNumber(376);
        int int22 = collatzConjecture0.nextNumber(20);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 188 + "'", int20 == 188);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(71);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(8);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((-1));
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(76);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 38 + "'", int14 == 38);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(5);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int6 = collatzConjecture0.nextNumber(100);
        java.lang.Class<?> wildcardClass7 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(110);
        int int24 = collatzConjecture0.nextNumber(466);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 233 + "'", int24 == 233);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(19);
        int int18 = collatzConjecture0.nextNumber(125);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) ' ');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 376 + "'", int18 == 376);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        int int26 = collatzConjecture0.nextNumber(121);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 364 + "'", int26 == 364);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        int int12 = collatzConjecture0.nextNumber(1);
        int int14 = collatzConjecture0.nextNumber(55);
        int int16 = collatzConjecture0.nextNumber(107);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 322 + "'", int16 == 322);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        int int10 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(73);
        int int14 = collatzConjecture0.nextNumber(8);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(2);
        int int10 = collatzConjecture0.nextNumber(106);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(16);
        int int16 = collatzConjecture0.nextNumber(29);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 88 + "'", int16 == 88);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(110);
        int int22 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(160);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber(8);
        int int10 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(38);
        int int14 = collatzConjecture0.nextNumber(484);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 242 + "'", int14 == 242);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(188);
        int int18 = collatzConjecture0.nextNumber(160);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(8);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(412);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int12 = collatzConjecture0.nextNumber(166);
        int int14 = collatzConjecture0.nextNumber((int) (short) 10);
        int int16 = collatzConjecture0.nextNumber(106);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(188);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 10);
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
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
        int int24 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(47);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 88 + "'", int24 == 88);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(38);
        int int28 = collatzConjecture0.nextNumber((-1));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(188);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(20);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(38);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(4);
        int int8 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(50);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 55 + "'", int8 == 55);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(40);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(55);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        int int12 = collatzConjecture0.nextNumber(29);
        int int14 = collatzConjecture0.nextNumber((int) (short) 10);
        int int16 = collatzConjecture0.nextNumber(0);
        int int18 = collatzConjecture0.nextNumber(121);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 364 + "'", int18 == 364);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(166);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        int int22 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(71);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(100);
        int int12 = collatzConjecture0.nextNumber((int) (short) 10);
        int int14 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(52);
        int int18 = collatzConjecture0.nextNumber(20);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) ' ');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        int int22 = collatzConjecture0.nextNumber(376);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(53);
        int int26 = collatzConjecture0.nextNumber(91);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 188 + "'", int22 == 188);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 274 + "'", int26 == 274);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber(8);
        int int10 = collatzConjecture0.nextNumber(376);
        int int12 = collatzConjecture0.nextNumber(161);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 188 + "'", int10 == 188);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 484 + "'", int12 == 484);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(274);
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
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        int int26 = collatzConjecture0.nextNumber(137);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 412 + "'", int26 == 412);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(52);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 22 + "'", int26 == 22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(125);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(11);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(10);
        int int10 = collatzConjecture0.nextNumber(83);
        int int12 = collatzConjecture0.nextNumber(142);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 250 + "'", int10 == 250);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 71 + "'", int12 == 71);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
        int int24 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(22);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(121);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(29);
        int int16 = collatzConjecture0.nextNumber((int) '#');
        int int18 = collatzConjecture0.nextNumber((int) (byte) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(55);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 166 + "'", int10 == 166);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(322);
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        int int16 = collatzConjecture0.nextNumber((int) '#');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(88);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(322);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 1);
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
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(142);
        int int16 = collatzConjecture0.nextNumber(146);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 73 + "'", int16 == 73);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        int int28 = collatzConjecture0.nextNumber(47);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(29);
        java.lang.Class<?> wildcardClass31 = intList30.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 142 + "'", int28 == 142);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '4');
        int int18 = collatzConjecture0.nextNumber(83);
        int int20 = collatzConjecture0.nextNumber(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(8);
        int int10 = collatzConjecture0.nextNumber(34);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 17 + "'", int10 == 17);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        int int28 = collatzConjecture0.nextNumber(83);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 250 + "'", int28 == 250);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(80);
        int int24 = collatzConjecture0.nextNumber(214);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 107 + "'", int24 == 107);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
        int int20 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(250);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        int int26 = collatzConjecture0.nextNumber(121);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 364 + "'", int26 == 364);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(40);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber(364);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(376);
        int int14 = collatzConjecture0.nextNumber(52);
        int int16 = collatzConjecture0.nextNumber(110);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 182 + "'", int8 == 182);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26 + "'", int14 == 26);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 55 + "'", int16 == 55);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
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
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(25);
        int int18 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(220);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292 + "'", int18 == 292);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(1);
        int int14 = collatzConjecture0.nextNumber((int) (short) 1);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        int int30 = collatzConjecture0.nextNumber(700);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 350 + "'", int30 == 350);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(91);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(25);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(106);
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
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        int int24 = collatzConjecture0.nextNumber(1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 73 + "'", int16 == 73);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(103);
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(142);
        int int18 = collatzConjecture0.nextNumber(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(20);
        int int16 = collatzConjecture0.nextNumber(52);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(214);
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
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        int int24 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int26 = collatzConjecture0.nextNumber(17);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(142);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber(4);
        int int12 = collatzConjecture0.nextNumber(188);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 94 + "'", int12 == 94);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(5);
        int int30 = collatzConjecture0.nextNumber(214);
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
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 107 + "'", int30 == 107);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        int int24 = collatzConjecture0.nextNumber(71);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(25);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 214 + "'", int24 == 214);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber((int) 'a');
        int int14 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(242);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(22);
        int int12 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(40);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(146);
        int int6 = collatzConjecture0.nextNumber(250);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(206);
        int int12 = collatzConjecture0.nextNumber(40);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 125 + "'", int6 == 125);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(8);
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
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        int int16 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(20);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(19);
        int int22 = collatzConjecture0.nextNumber(233);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 700 + "'", int22 == 700);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(73);
        int int10 = collatzConjecture0.nextNumber(80);
        int int12 = collatzConjecture0.nextNumber(83);
        int int14 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(22);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 250 + "'", int12 == 250);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        int int22 = collatzConjecture0.nextNumber(182);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 91 + "'", int22 == 91);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        int int22 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(38);
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
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(1);
        int int24 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        int int20 = collatzConjecture0.nextNumber(292);
        int int22 = collatzConjecture0.nextNumber(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 146 + "'", int20 == 146);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(146);
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
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(484);
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
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber(38);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(19);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(22);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(166);
        int int16 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(25);
        int int20 = collatzConjecture0.nextNumber(160);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 80 + "'", int20 == 80);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(73);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((-1));
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(76);
        int int16 = collatzConjecture0.nextNumber(2);
        int int18 = collatzConjecture0.nextNumber(137);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 38 + "'", int14 == 38);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 412 + "'", int18 == 412);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(83);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int24 = collatzConjecture0.nextNumber(0);
        int int26 = collatzConjecture0.nextNumber(94);
        int int28 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 47 + "'", int26 == 47);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        int int14 = collatzConjecture0.nextNumber(10);
        int int16 = collatzConjecture0.nextNumber(29);
        int int18 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 88 + "'", int16 == 88);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 0);
        int int12 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(29);
        int int16 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(1);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 220 + "'", int12 == 220);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
        int int22 = collatzConjecture0.nextNumber((int) ' ');
        int int24 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(310);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 292 + "'", int24 == 292);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(700);
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
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        int int26 = collatzConjecture0.nextNumber((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 50 + "'", int26 == 50);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(50);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(34);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(166);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 292 + "'", int8 == 292);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        int int16 = collatzConjecture0.nextNumber(1);
        int int18 = collatzConjecture0.nextNumber(166);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 83 + "'", int18 == 83);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(5);
        int int26 = collatzConjecture0.nextNumber(166);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 83 + "'", int26 == 83);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(250);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(2);
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
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        int int22 = collatzConjecture0.nextNumber(25);
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
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 76 + "'", int22 == 76);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        int int28 = collatzConjecture0.nextNumber(38);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(700);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 73 + "'", int26 == 73);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 19 + "'", int28 == 19);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber(364);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(376);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 182 + "'", int8 == 182);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(8);
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
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        int int18 = collatzConjecture0.nextNumber(0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(0);
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
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(20);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(700);
        int int30 = collatzConjecture0.nextNumber(100);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50 + "'", int30 == 50);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(220);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(52);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(40);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(34);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(20);
        int int24 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) ' ');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(38);
        int int14 = collatzConjecture0.nextNumber(1);
        int int16 = collatzConjecture0.nextNumber((-2));
        int int18 = collatzConjecture0.nextNumber(106);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(47);
        int int12 = collatzConjecture0.nextNumber(47);
        int int14 = collatzConjecture0.nextNumber(17);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(38);
        int int18 = collatzConjecture0.nextNumber((int) ' ');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 142 + "'", int12 == 142);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        int int24 = collatzConjecture0.nextNumber((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(29);
        int int16 = collatzConjecture0.nextNumber((int) '#');
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(73);
        int int10 = collatzConjecture0.nextNumber(80);
        int int12 = collatzConjecture0.nextNumber(83);
        int int14 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 250 + "'", int12 == 250);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        int int26 = collatzConjecture0.nextNumber(25);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 76 + "'", int26 == 76);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(206);
        java.lang.Class<?> wildcardClass33 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(17);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int18 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(700);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292 + "'", int18 == 292);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        int int16 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(10);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(106);
        int int20 = collatzConjecture0.nextNumber(83);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250 + "'", int20 == 250);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(22);
        int int22 = collatzConjecture0.nextNumber(250);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 125 + "'", int22 == 125);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(80);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(166);
        int int12 = collatzConjecture0.nextNumber(160);
        int int14 = collatzConjecture0.nextNumber(242);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 83 + "'", int10 == 83);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 80 + "'", int12 == 80);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 121 + "'", int14 == 121);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(34);
        int int14 = collatzConjecture0.nextNumber(40);
        int int16 = collatzConjecture0.nextNumber(233);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 700 + "'", int16 == 700);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
        int int22 = collatzConjecture0.nextNumber((int) ' ');
        int int24 = collatzConjecture0.nextNumber(38);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) ' ');
        int int24 = collatzConjecture0.nextNumber((int) 'a');
        int int26 = collatzConjecture0.nextNumber(155);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 292 + "'", int24 == 292);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 466 + "'", int26 == 466);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(53);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(38);
        int int14 = collatzConjecture0.nextNumber(125);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        int int18 = collatzConjecture0.nextNumber(142);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 71 + "'", int18 == 71);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        int int24 = collatzConjecture0.nextNumber(5);
        int int26 = collatzConjecture0.nextNumber(0);
        int int28 = collatzConjecture0.nextNumber(274);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 137 + "'", int28 == 137);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(322);
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
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(10);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
        int int24 = collatzConjecture0.nextNumber((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        int int24 = collatzConjecture0.nextNumber(10);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
        int int30 = collatzConjecture0.nextNumber(94);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(125);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 47 + "'", int30 == 47);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(142);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(83);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(155);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 250 + "'", int6 == 250);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        int int20 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(242);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 83 + "'", int20 == 83);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(71);
        int int30 = collatzConjecture0.nextNumber(94);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 47 + "'", int30 == 47);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        int int20 = collatzConjecture0.nextNumber(10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(376);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(107);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int10 = collatzConjecture0.nextNumber(4);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(214);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 125 + "'", int20 == 125);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(484);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 242 + "'", int12 == 242);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(166);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int10 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(182);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(214);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 125 + "'", int20 == 125);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(142);
        int int22 = collatzConjecture0.nextNumber(110);
        int int24 = collatzConjecture0.nextNumber((-2));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 55 + "'", int22 == 55);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(94);
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
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(182);
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
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        int int18 = collatzConjecture0.nextNumber(55);
        int int20 = collatzConjecture0.nextNumber(29);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 166 + "'", int18 == 166);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 88 + "'", int20 == 88);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        int int24 = collatzConjecture0.nextNumber((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(44);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int20 = collatzConjecture0.nextNumber(160);
        int int22 = collatzConjecture0.nextNumber(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 80 + "'", int20 == 80);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(10);
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
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int16 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(292);
        int int22 = collatzConjecture0.nextNumber(55);
        int int24 = collatzConjecture0.nextNumber(376);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 166 + "'", int22 == 166);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 188 + "'", int24 == 188);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        int int28 = collatzConjecture0.nextNumber(34);
        int int30 = collatzConjecture0.nextNumber((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 17 + "'", int28 == 17);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
        int int22 = collatzConjecture0.nextNumber(1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) ' ');
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        int int26 = collatzConjecture0.nextNumber(11);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 34 + "'", int26 == 34);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(83);
        int int12 = collatzConjecture0.nextNumber(94);
        int int14 = collatzConjecture0.nextNumber(292);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 250 + "'", int10 == 250);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) ' ');
        int int24 = collatzConjecture0.nextNumber(88);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 44 + "'", int24 == 44);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(142);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
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
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) '4');
        int int10 = collatzConjecture0.nextNumber(0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        int int24 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(188);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 76 + "'", int22 == 76);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 160 + "'", int24 == 160);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(8);
        int int14 = collatzConjecture0.nextNumber(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 142 + "'", int14 == 142);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        int int16 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(20);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(166);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(160);
        int int26 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(100);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 88 + "'", int26 == 88);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(182);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(188);
        int int26 = collatzConjecture0.nextNumber(19);
        int int28 = collatzConjecture0.nextNumber(40);
        int int30 = collatzConjecture0.nextNumber((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 58 + "'", int26 == 58);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(146);
        int int16 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(292);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(10);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber(5);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(52);
        int int32 = collatzConjecture0.nextNumber(220);
        int int34 = collatzConjecture0.nextNumber(466);
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
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 110 + "'", int32 == 110);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 233 + "'", int34 == 233);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        int int28 = collatzConjecture0.nextNumber(55);
        int int30 = collatzConjecture0.nextNumber(110);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 166 + "'", int28 == 166);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 55 + "'", int30 == 55);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(76);
        int int12 = collatzConjecture0.nextNumber(26);
        int int14 = collatzConjecture0.nextNumber(19);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(220);
        int int18 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
        int int20 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(160);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        int int16 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(20);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(47);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(26);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        int int20 = collatzConjecture0.nextNumber((int) (short) 1);
        int int22 = collatzConjecture0.nextNumber((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(80);
        int int28 = collatzConjecture0.nextNumber(34);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 17 + "'", int28 == 17);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        int int24 = collatzConjecture0.nextNumber((int) '#');
        int int26 = collatzConjecture0.nextNumber(142);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 106 + "'", int24 == 106);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 71 + "'", int26 == 71);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(160);
        int int10 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(16);
        int int14 = collatzConjecture0.nextNumber(26);
        int int16 = collatzConjecture0.nextNumber(94);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 47 + "'", int16 == 47);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
        int int24 = collatzConjecture0.nextNumber(76);
        int int26 = collatzConjecture0.nextNumber(94);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 38 + "'", int24 == 38);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 47 + "'", int26 == 47);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
        int int28 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(94);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 44 + "'", int26 == 44);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 40 + "'", int28 == 40);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        int int22 = collatzConjecture0.nextNumber(106);
        int int24 = collatzConjecture0.nextNumber((int) '#');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 53 + "'", int22 == 53);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 106 + "'", int24 == 106);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(26);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
        int int24 = collatzConjecture0.nextNumber(8);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(20);
        int int16 = collatzConjecture0.nextNumber((-2));
        int int18 = collatzConjecture0.nextNumber((int) '#');
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 106 + "'", int18 == 106);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int18 = collatzConjecture0.nextNumber(8);
        int int20 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int22 = collatzConjecture0.nextNumber(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber(8);
        int int10 = collatzConjecture0.nextNumber((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(182);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 91 + "'", int14 == 91);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(188);
        int int26 = collatzConjecture0.nextNumber(19);
        int int28 = collatzConjecture0.nextNumber(17);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 58 + "'", int26 == 58);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(0);
        int int16 = collatzConjecture0.nextNumber(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(125);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(155);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
        int int26 = collatzConjecture0.nextNumber((-1));
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(182);
        int int10 = collatzConjecture0.nextNumber(137);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(188);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 73 + "'", int6 == 73);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 412 + "'", int10 == 412);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(47);
        int int12 = collatzConjecture0.nextNumber(47);
        int int14 = collatzConjecture0.nextNumber(17);
        int int16 = collatzConjecture0.nextNumber(484);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 142 + "'", int12 == 142);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 242 + "'", int16 == 242);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
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
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 17 + "'", int20 == 17);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        int int24 = collatzConjecture0.nextNumber(106);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        int int22 = collatzConjecture0.nextNumber(8);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(125);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(121);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
        int int24 = collatzConjecture0.nextNumber((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        int int22 = collatzConjecture0.nextNumber(137);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(188);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 412 + "'", int22 == 412);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(160);
        int int12 = collatzConjecture0.nextNumber(34);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(142);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber(20);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
        int int20 = collatzConjecture0.nextNumber(146);
        int int22 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(103);
        int int26 = collatzConjecture0.nextNumber(38);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 73 + "'", int20 == 73);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        int int24 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber(8);
        int int10 = collatzConjecture0.nextNumber(1);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        int int26 = collatzConjecture0.nextNumber(71);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 214 + "'", int26 == 214);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(17);
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
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        int int14 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(220);
        int int18 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(11);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 73 + "'", int14 == 73);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(350);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        int int16 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(10);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

