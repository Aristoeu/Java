package CollatzConjecture;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(83);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        int int24 = collatzConjecture0.nextNumber(25);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) 'a');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int28 = collatzConjecture0.nextNumber(88);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(4);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 44 + "'", int28 == 44);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        int int26 = collatzConjecture0.nextNumber(88);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(155);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 44 + "'", int26 == 44);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        int int24 = collatzConjecture0.nextNumber(364);
        int int26 = collatzConjecture0.nextNumber((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 182 + "'", int24 == 182);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        int int14 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(88);
        int int18 = collatzConjecture0.nextNumber((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 40 + "'", int14 == 40);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(80);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(364);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(83);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(94);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 250 + "'", int6 == 250);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber(364);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 182 + "'", int8 == 182);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        int int28 = collatzConjecture0.nextNumber(121);
        int int30 = collatzConjecture0.nextNumber((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 364 + "'", int28 == 364);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        int int28 = collatzConjecture0.nextNumber(58);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 29 + "'", int28 == 29);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        int int22 = collatzConjecture0.nextNumber(100);
        int int24 = collatzConjecture0.nextNumber(83);
        int int26 = collatzConjecture0.nextNumber(214);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 250 + "'", int24 == 250);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 107 + "'", int26 == 107);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        int int32 = collatzConjecture0.nextNumber((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(10);
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
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        int int12 = collatzConjecture0.nextNumber(29);
        int int14 = collatzConjecture0.nextNumber(11);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(40);
        int int24 = collatzConjecture0.nextNumber(94);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(175);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 47 + "'", int24 == 47);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(40);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        int int14 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        int int20 = collatzConjecture0.nextNumber(4);
        int int22 = collatzConjecture0.nextNumber((int) (short) 0);
        int int24 = collatzConjecture0.nextNumber((int) (short) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 80 + "'", int12 == 80);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(322);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(94);
        int int32 = collatzConjecture0.nextNumber((int) (short) 100);
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
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 50 + "'", int32 == 50);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(242);
        int int16 = collatzConjecture0.nextNumber(220);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 110 + "'", int16 == 110);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber((int) '#');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 106 + "'", int6 == 106);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(71);
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
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        int int14 = collatzConjecture0.nextNumber(160);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 80 + "'", int14 == 80);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        int int20 = collatzConjecture0.nextNumber(88);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 44 + "'", int20 == 44);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        int int28 = collatzConjecture0.nextNumber((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        int int20 = collatzConjecture0.nextNumber(26);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(19);
        int int26 = collatzConjecture0.nextNumber(76);
        int int28 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 38 + "'", int26 == 38);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int24 = collatzConjecture0.nextNumber(47);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 142 + "'", int24 == 142);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        int int20 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(137);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 26 + "'", int20 == 26);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        int int24 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(350);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        int int28 = collatzConjecture0.nextNumber(0);
        int int30 = collatzConjecture0.nextNumber(100);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50 + "'", int30 == 50);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(376);
        int int18 = collatzConjecture0.nextNumber((int) (short) 100);
        int int20 = collatzConjecture0.nextNumber(17);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(34);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(5);
        int int26 = collatzConjecture0.nextNumber(20);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(80);
        int int12 = collatzConjecture0.nextNumber(38);
        int int14 = collatzConjecture0.nextNumber(376);
        int int16 = collatzConjecture0.nextNumber(40);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 188 + "'", int14 == 188);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        int int22 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(322);
        int int26 = collatzConjecture0.nextNumber(38);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (short) 10);
        int int30 = collatzConjecture0.nextNumber(233);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 700 + "'", int30 == 700);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(20);
        int int18 = collatzConjecture0.nextNumber(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        int int26 = collatzConjecture0.nextNumber(5);
        int int28 = collatzConjecture0.nextNumber(182);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 91 + "'", int28 == 91);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(103);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 73 + "'", int18 == 73);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        int int22 = collatzConjecture0.nextNumber(91);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(106);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 274 + "'", int22 == 274);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(274);
        int int16 = collatzConjecture0.nextNumber(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(8);
        int int12 = collatzConjecture0.nextNumber(412);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(19);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 206 + "'", int12 == 206);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        int int24 = collatzConjecture0.nextNumber(44);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(26);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int20 = collatzConjecture0.nextNumber(274);
        int int22 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 137 + "'", int20 == 137);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber(155);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(22);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 466 + "'", int8 == 466);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(4);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        int int20 = collatzConjecture0.nextNumber(53);
        int int22 = collatzConjecture0.nextNumber(53);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 125 + "'", int18 == 125);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 160 + "'", int20 == 160);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 160 + "'", int22 == 160);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int20 = collatzConjecture0.nextNumber(274);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 137 + "'", int20 == 137);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(4);
        int int28 = collatzConjecture0.nextNumber(25);
        int int30 = collatzConjecture0.nextNumber(142);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(73);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 76 + "'", int28 == 76);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 71 + "'", int30 == 71);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(16);
        int int22 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(19);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 80 + "'", int22 == 80);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        int int20 = collatzConjecture0.nextNumber(91);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 274 + "'", int20 == 274);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        int int20 = collatzConjecture0.nextNumber(161);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 484 + "'", int20 == 484);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(160);
        int int14 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(83);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 80 + "'", int12 == 80);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        int int28 = collatzConjecture0.nextNumber(22);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(80);
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
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '#');
        int int30 = collatzConjecture0.nextNumber(242);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 160 + "'", int24 == 160);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 121 + "'", int30 == 121);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        int int18 = collatzConjecture0.nextNumber(38);
        int int20 = collatzConjecture0.nextNumber(26);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(350);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        int int26 = collatzConjecture0.nextNumber(466);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 233 + "'", int26 == 233);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        int int22 = collatzConjecture0.nextNumber(10);
        int int24 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(292);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 292 + "'", int24 == 292);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(53);
        int int8 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(155);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(38);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 160 + "'", int6 == 160);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber(364);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(146);
        int int12 = collatzConjecture0.nextNumber(107);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 182 + "'", int8 == 182);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 322 + "'", int12 == 322);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(40);
        int int32 = collatzConjecture0.nextNumber(71);
        int int34 = collatzConjecture0.nextNumber(146);
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
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 214 + "'", int32 == 214);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 73 + "'", int34 == 73);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(242);
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
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        int int22 = collatzConjecture0.nextNumber((int) '#');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 106 + "'", int22 == 106);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber(376);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(146);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 188 + "'", int8 == 188);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(110);
        int int14 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(125);
        int int18 = collatzConjecture0.nextNumber(142);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(155);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 71 + "'", int18 == 71);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        int int34 = collatzConjecture0.nextNumber(50);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 25 + "'", int34 == 25);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(5);
        int int6 = collatzConjecture0.nextNumber(10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(55);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(25);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 166 + "'", int8 == 166);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        int int14 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(466);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 40 + "'", int14 == 40);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        int int14 = collatzConjecture0.nextNumber(10);
        int int16 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 88 + "'", int16 == 88);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(40);
        int int22 = collatzConjecture0.nextNumber(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 142 + "'", int22 == 142);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(8);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int28 = collatzConjecture0.nextNumber((int) (short) 10);
        int int30 = collatzConjecture0.nextNumber(4);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(274);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(100);
        int int12 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(40);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 76 + "'", int14 == 76);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 142 + "'", int18 == 142);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        int int28 = collatzConjecture0.nextNumber(206);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(58);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 103 + "'", int28 == 103);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int16 = collatzConjecture0.nextNumber(29);
        int int18 = collatzConjecture0.nextNumber(76);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 88 + "'", int16 == 88);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(26);
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
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(0);
        int int16 = collatzConjecture0.nextNumber(376);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(182);
        int int20 = collatzConjecture0.nextNumber(5);
        int int22 = collatzConjecture0.nextNumber(44);
        int int24 = collatzConjecture0.nextNumber(52);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) '#');
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 188 + "'", int16 == 188);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
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
        int int30 = collatzConjecture0.nextNumber(80);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 40 + "'", int30 == 40);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(125);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(322);
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
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(160);
        int int14 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '#');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 80 + "'", int12 == 80);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(91);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 274 + "'", int16 == 274);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(19);
        int int28 = collatzConjecture0.nextNumber((int) (short) -1);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        int int22 = collatzConjecture0.nextNumber(160);
        int int24 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 80 + "'", int22 == 80);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(274);
        int int22 = collatzConjecture0.nextNumber(220);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 110 + "'", int22 == 110);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(22);
        int int12 = collatzConjecture0.nextNumber(292);
        int int14 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(76);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 146 + "'", int12 == 146);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 76 + "'", int14 == 76);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 188 + "'", int28 == 188);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 55 + "'", int30 == 55);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(125);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(55);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(125);
        int int12 = collatzConjecture0.nextNumber(25);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 166 + "'", int8 == 166);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 76 + "'", int12 == 76);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        int int20 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(13);
        int int24 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(350);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 292 + "'", int24 == 292);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        int int10 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(83);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber(250);
        int int26 = collatzConjecture0.nextNumber(220);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 125 + "'", int24 == 125);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 110 + "'", int26 == 110);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
        int int20 = collatzConjecture0.nextNumber(91);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 274 + "'", int20 == 274);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        int int22 = collatzConjecture0.nextNumber(34);
        int int24 = collatzConjecture0.nextNumber(19);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(274);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 17 + "'", int22 == 17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 58 + "'", int24 == 58);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        int int20 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(26);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(166);
        int int14 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(53);
        int int18 = collatzConjecture0.nextNumber(188);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(110);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(5);
        int int10 = collatzConjecture0.nextNumber(121);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber((int) (short) -1);
        int int16 = collatzConjecture0.nextNumber(142);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 364 + "'", int10 == 364);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 71 + "'", int16 == 71);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        int int20 = collatzConjecture0.nextNumber(4);
        int int22 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(25);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(40);
        int int24 = collatzConjecture0.nextNumber(91);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 274 + "'", int24 == 274);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(53);
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
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(142);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture((int) '#');
        int int32 = collatzConjecture0.nextNumber(13);
        int int34 = collatzConjecture0.nextNumber(19);
        int int36 = collatzConjecture0.nextNumber(233);
        java.lang.Class<?> wildcardClass37 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 40 + "'", int32 == 40);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 58 + "'", int34 == 58);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 700 + "'", int36 == 700);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 76 + "'", int28 == 76);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber((int) (short) -1);
        int int14 = collatzConjecture0.nextNumber(142);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(137);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(4);
        int int8 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 55 + "'", int8 == 55);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(160);
        int int12 = collatzConjecture0.nextNumber(34);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(142);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(26);
        int int20 = collatzConjecture0.nextNumber(242);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 121 + "'", int20 == 121);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        int int22 = collatzConjecture0.nextNumber(29);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 88 + "'", int22 == 88);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        int int20 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(25);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture((int) ' ');
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
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) ' ');
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(160);
        int int14 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(83);
        int int18 = collatzConjecture0.nextNumber((int) (short) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 80 + "'", int12 == 80);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 142 + "'", int26 == 142);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        int int26 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(310);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        int int24 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(206);
        int int28 = collatzConjecture0.nextNumber(206);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 103 + "'", int28 == 103);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(25);
        int int28 = collatzConjecture0.nextNumber(20);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(94);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        int int12 = collatzConjecture0.nextNumber(13);
        int int14 = collatzConjecture0.nextNumber(142);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        int int6 = collatzConjecture0.nextNumber(292);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int10 = collatzConjecture0.nextNumber(88);
        int int12 = collatzConjecture0.nextNumber((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 146 + "'", int6 == 146);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 44 + "'", int10 == 44);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(121);
        int int16 = collatzConjecture0.nextNumber(242);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 364 + "'", int14 == 364);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 121 + "'", int16 == 121);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '#');
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(10);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        int int26 = collatzConjecture0.nextNumber(292);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 146 + "'", int26 == 146);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 38 + "'", int20 == 38);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(34);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(55);
        int int16 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(250);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        int int18 = collatzConjecture0.nextNumber(25);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        int int26 = collatzConjecture0.nextNumber(52);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '#');
        int int30 = collatzConjecture0.nextNumber((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 26 + "'", int26 == 26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
        int int26 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(250);
        int int30 = collatzConjecture0.nextNumber(142);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 71 + "'", int30 == 71);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(13);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(8);
        int int28 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(142);
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
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(91);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(100);
        int int20 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 274 + "'", int16 == 274);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(242);
        int int26 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(412);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber(160);
        int int20 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(188);
        int int24 = collatzConjecture0.nextNumber(188);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(364);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 73 + "'", int20 == 73);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 94 + "'", int24 == 94);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(91);
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
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int14 = collatzConjecture0.nextNumber(103);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 310 + "'", int14 == 310);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        int int30 = collatzConjecture0.nextNumber(137);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 412 + "'", int30 == 412);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
        int int22 = collatzConjecture0.nextNumber(376);
        int int24 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(526);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 188 + "'", int22 == 188);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(188);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(160);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((-2));
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
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        int int20 = collatzConjecture0.nextNumber(146);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 73 + "'", int20 == 73);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(484);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 55 + "'", int16 == 55);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(40);
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
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(182);
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
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(34);
        int int14 = collatzConjecture0.nextNumber(80);
        int int16 = collatzConjecture0.nextNumber(25);
        int int18 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(83);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 40 + "'", int14 == 40);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int14 = collatzConjecture0.nextNumber(214);
        int int16 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 107 + "'", int14 == 107);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int28 = collatzConjecture0.nextNumber((int) (short) 10);
        int int30 = collatzConjecture0.nextNumber(107);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 322 + "'", int30 == 322);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        int int14 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(13);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(38);
        int int14 = collatzConjecture0.nextNumber(125);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        int int18 = collatzConjecture0.nextNumber((-2));
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) -1);
        int int10 = collatzConjecture0.nextNumber(88);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(214);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 44 + "'", int10 == 44);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(1);
        int int26 = collatzConjecture0.nextNumber(292);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 146 + "'", int26 == 146);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        int int24 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(38);
        int int28 = collatzConjecture0.nextNumber(47);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 142 + "'", int28 == 142);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(137);
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
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(188);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        int int22 = collatzConjecture0.nextNumber((int) (short) -1);
        int int24 = collatzConjecture0.nextNumber((int) '#');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 106 + "'", int24 == 106);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber(80);
        int int18 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(50);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292 + "'", int18 == 292);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 142 + "'", int10 == 142);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) ' ');
        int int6 = collatzConjecture0.nextNumber(4);
        int int8 = collatzConjecture0.nextNumber(11);
        int int10 = collatzConjecture0.nextNumber(160);
        int int12 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(8);
        int int22 = collatzConjecture0.nextNumber(220);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 110 + "'", int22 == 110);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        int int24 = collatzConjecture0.nextNumber(188);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 94 + "'", int24 == 94);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        int int20 = collatzConjecture0.nextNumber(40);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 88 + "'", int4 == 88);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(19);
        int int20 = collatzConjecture0.nextNumber((int) (short) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(106);
        int int18 = collatzConjecture0.nextNumber(161);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 484 + "'", int18 == 484);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        int int28 = collatzConjecture0.nextNumber(484);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 242 + "'", int28 == 242);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(83);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(76);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(242);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(34);
        int int18 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber(250);
        int int18 = collatzConjecture0.nextNumber(166);
        int int20 = collatzConjecture0.nextNumber(26);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 125 + "'", int16 == 125);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 83 + "'", int18 == 83);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        int int20 = collatzConjecture0.nextNumber(220);
        int int22 = collatzConjecture0.nextNumber((int) ' ');
        int int24 = collatzConjecture0.nextNumber(83);
        int int26 = collatzConjecture0.nextNumber((int) (short) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 110 + "'", int20 == 110);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 250 + "'", int24 == 250);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 50 + "'", int26 == 50);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        int int22 = collatzConjecture0.nextNumber(103);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 55 + "'", int18 == 55);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 310 + "'", int22 == 310);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(250);
        int int28 = collatzConjecture0.nextNumber(20);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(80);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(38);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(34);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(26);
        int int16 = collatzConjecture0.nextNumber((-1));
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(274);
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
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(19);
        int int28 = collatzConjecture0.nextNumber(10);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        int int24 = collatzConjecture0.nextNumber(155);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 466 + "'", int24 == 466);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int14 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(350);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
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
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(55);
        int int14 = collatzConjecture0.nextNumber(52);
        int int16 = collatzConjecture0.nextNumber(16);
        int int18 = collatzConjecture0.nextNumber(106);
        int int20 = collatzConjecture0.nextNumber(83);
        int int22 = collatzConjecture0.nextNumber(484);
        int int24 = collatzConjecture0.nextNumber((int) (short) 100);
        int int26 = collatzConjecture0.nextNumber(322);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 26 + "'", int14 == 26);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250 + "'", int20 == 250);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 242 + "'", int22 == 242);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 161 + "'", int26 == 161);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(8);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 10);
        int int20 = collatzConjecture0.nextNumber(22);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(110);
        int int14 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(125);
        int int18 = collatzConjecture0.nextNumber(142);
        int int20 = collatzConjecture0.nextNumber(412);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 71 + "'", int18 == 71);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 206 + "'", int20 == 206);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        int int22 = collatzConjecture0.nextNumber(71);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(137);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 214 + "'", int22 == 214);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(20);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(80);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(142);
        int int20 = collatzConjecture0.nextNumber(38);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(19);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 19 + "'", int20 == 19);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
        int int22 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(107);
        int int28 = collatzConjecture0.nextNumber(310);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 40 + "'", int22 == 40);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 155 + "'", int28 == 155);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        int int16 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) '4');
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(242);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 73 + "'", int22 == 73);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 1);
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
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        int int24 = collatzConjecture0.nextNumber(17);
        int int26 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(13);
        int int24 = collatzConjecture0.nextNumber(364);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(91);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 182 + "'", int24 == 182);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        int int24 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(53);
        int int28 = collatzConjecture0.nextNumber(13);
        int int30 = collatzConjecture0.nextNumber(52);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 40 + "'", int28 == 40);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26 + "'", int30 == 26);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(242);
        int int12 = collatzConjecture0.nextNumber(103);
        int int14 = collatzConjecture0.nextNumber(364);
        int int16 = collatzConjecture0.nextNumber(166);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 121 + "'", int10 == 121);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 310 + "'", int12 == 310);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 182 + "'", int14 == 182);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 83 + "'", int16 == 83);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(250);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 76 + "'", int22 == 76);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(73);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(71);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(146);
        int int34 = collatzConjecture0.nextNumber((int) (short) 1);
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
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(5);
        int int10 = collatzConjecture0.nextNumber(121);
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(220);
        int int16 = collatzConjecture0.nextNumber(0);
        int int18 = collatzConjecture0.nextNumber((int) '4');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 364 + "'", int10 == 364);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(214);
        int int30 = collatzConjecture0.nextNumber(364);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 182 + "'", int30 == 182);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
        int int26 = collatzConjecture0.nextNumber(700);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(22);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture((int) '4');
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 350 + "'", int26 == 350);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber(38);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(250);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
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
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber(11);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) '4');
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
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(350);
        java.lang.Class<?> wildcardClass11 = intList10.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(19);
        int int16 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(58);
        int int14 = collatzConjecture0.nextNumber(38);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        int int22 = collatzConjecture0.nextNumber(44);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber(19);
        int int10 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(110);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 58 + "'", int8 == 58);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(146);
        int int16 = collatzConjecture0.nextNumber(19);
        int int18 = collatzConjecture0.nextNumber(220);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 58 + "'", int16 == 58);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 110 + "'", int18 == 110);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(125);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(103);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(107);
        int int22 = collatzConjecture0.nextNumber(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 142 + "'", int22 == 142);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber(4);
        int int12 = collatzConjecture0.nextNumber(188);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 94 + "'", int12 == 94);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        int int20 = collatzConjecture0.nextNumber(376);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 166 + "'", int18 == 166);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 188 + "'", int20 == 188);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(155);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int18 = collatzConjecture0.nextNumber(146);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 73 + "'", int18 == 73);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        int int24 = collatzConjecture0.nextNumber((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(40);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(8);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(166);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int6 = collatzConjecture0.nextNumber(322);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 161 + "'", int6 == 161);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(76);
        int int18 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(137);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int28 = collatzConjecture0.nextNumber(484);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(4);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 242 + "'", int28 == 242);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 73 + "'", int10 == 73);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        int int10 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber((int) (short) 10);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(106);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        int int12 = collatzConjecture0.nextNumber(1);
        int int14 = collatzConjecture0.nextNumber(55);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int12 = collatzConjecture0.nextNumber(166);
        int int14 = collatzConjecture0.nextNumber(161);
        int int16 = collatzConjecture0.nextNumber(292);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 484 + "'", int14 == 484);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 146 + "'", int16 == 146);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        int int22 = collatzConjecture0.nextNumber(107);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(53);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 322 + "'", int22 == 322);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber(160);
        int int20 = collatzConjecture0.nextNumber(26);
        int int22 = collatzConjecture0.nextNumber(19);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 58 + "'", int22 == 58);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        int int22 = collatzConjecture0.nextNumber(121);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 364 + "'", int22 == 364);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(25);
        java.lang.Class<?> wildcardClass3 = intList2.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(100);
        int int16 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(55);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber(19);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(80);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(58);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 58 + "'", int8 == 58);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(166);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int28 = collatzConjecture0.nextNumber(88);
        int int30 = collatzConjecture0.nextNumber(106);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 44 + "'", int28 == 44);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 53 + "'", int30 == 53);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        int int20 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(214);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        int int20 = collatzConjecture0.nextNumber(161);
        int int22 = collatzConjecture0.nextNumber(11);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 484 + "'", int20 == 484);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 34 + "'", int22 == 34);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        int int16 = collatzConjecture0.nextNumber(466);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 233 + "'", int16 == 233);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
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
        int int24 = collatzConjecture0.nextNumber(160);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(22);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(175);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 106 + "'", int14 == 106);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(22);
        int int30 = collatzConjecture0.nextNumber(466);
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
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 233 + "'", int30 == 233);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        int int28 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(16);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 29 + "'", int28 == 29);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(484);
        int int12 = collatzConjecture0.nextNumber(55);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 166 + "'", int12 == 166);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        int int24 = collatzConjecture0.nextNumber(110);
        int int26 = collatzConjecture0.nextNumber(38);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 55 + "'", int24 == 55);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        int int16 = collatzConjecture0.nextNumber((int) '4');
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        int int14 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(26);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        int int12 = collatzConjecture0.nextNumber(29);
        int int14 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(34);
        int int18 = collatzConjecture0.nextNumber(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(20);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        int int12 = collatzConjecture0.nextNumber(110);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 55 + "'", int12 == 55);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(55);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
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
        int int24 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(206);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(10);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(466);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(166);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(161);
        int int24 = collatzConjecture0.nextNumber(29);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 88 + "'", int24 == 88);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 26 + "'", int26 == 26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(91);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        int int14 = collatzConjecture0.nextNumber(125);
        int int16 = collatzConjecture0.nextNumber(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
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
        int int24 = collatzConjecture0.nextNumber(13);
        int int26 = collatzConjecture0.nextNumber(0);
        int int28 = collatzConjecture0.nextNumber(0);
        int int30 = collatzConjecture0.nextNumber(91);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(58);
        java.lang.Class<?> wildcardClass33 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 274 + "'", int30 == 274);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
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
        int int20 = collatzConjecture0.nextNumber((int) (byte) 0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(322);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(38);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(188);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        int int28 = collatzConjecture0.nextNumber((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(13);
        int int24 = collatzConjecture0.nextNumber(322);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 73 + "'", int18 == 73);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 161 + "'", int24 == 161);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        int int32 = collatzConjecture0.nextNumber(142);
        int int34 = collatzConjecture0.nextNumber(206);
        int int36 = collatzConjecture0.nextNumber(40);
        int int38 = collatzConjecture0.nextNumber(350);
        java.lang.Class<?> wildcardClass39 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 71 + "'", int32 == 71);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 103 + "'", int34 == 103);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20 + "'", int36 == 20);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 175 + "'", int38 == 175);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
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
        int int30 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass33 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 220 + "'", int30 == 220);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(160);
        int int12 = collatzConjecture0.nextNumber(34);
        int int14 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(53);
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
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
        int int28 = collatzConjecture0.nextNumber(55);
        int int30 = collatzConjecture0.nextNumber(242);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 166 + "'", int28 == 166);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 121 + "'", int30 == 121);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) ' ');
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(322);
        int int12 = collatzConjecture0.nextNumber(214);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(100);
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
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(44);
        int int14 = collatzConjecture0.nextNumber(71);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(412);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 214 + "'", int14 == 214);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber(100);
        int int18 = collatzConjecture0.nextNumber(107);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 322 + "'", int18 == 322);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(250);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
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
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(19);
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
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
        int int24 = collatzConjecture0.nextNumber(107);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 322 + "'", int24 == 322);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((int) ' ');
        int int6 = collatzConjecture0.nextNumber(38);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        int int20 = collatzConjecture0.nextNumber((-1));
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292 + "'", int18 == 292);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
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
        int int28 = collatzConjecture0.nextNumber(83);
        int int30 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 250 + "'", int28 == 250);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
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
        int int20 = collatzConjecture0.nextNumber(76);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 38 + "'", int20 == 38);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(47);
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
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(376);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(26);
        int int12 = collatzConjecture0.nextNumber(220);
        int int14 = collatzConjecture0.nextNumber(364);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 110 + "'", int12 == 110);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 182 + "'", int14 == 182);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(188);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(146);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int16 = collatzConjecture0.nextNumber(220);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(1);
        int int20 = collatzConjecture0.nextNumber(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 110 + "'", int16 == 110);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 142 + "'", int20 == 142);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(55);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(25);
        int int24 = collatzConjecture0.nextNumber(50);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(94);
        int int14 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(233);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 106 + "'", int14 == 106);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        int int30 = collatzConjecture0.nextNumber(5);
        int int32 = collatzConjecture0.nextNumber(19);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16 + "'", int30 == 16);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 58 + "'", int32 == 58);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(17);
        java.lang.Class<?> wildcardClass7 = intList6.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(160);
        int int14 = collatzConjecture0.nextNumber(80);
        int int16 = collatzConjecture0.nextNumber(11);
        int int18 = collatzConjecture0.nextNumber(8);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 80 + "'", int12 == 80);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 40 + "'", int14 == 40);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        int int20 = collatzConjecture0.nextNumber(166);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 83 + "'", int20 == 83);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(160);
        int int12 = collatzConjecture0.nextNumber(34);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(142);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber(34);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(214);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(107);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
        int int28 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(137);
        java.lang.Class<?> wildcardClass31 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
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
        int int22 = collatzConjecture0.nextNumber((int) '#');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 106 + "'", int22 == 106);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(40);
        int int16 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) 'a');
        int int20 = collatzConjecture0.nextNumber((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(34);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) '4');
        int int22 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(88);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(58);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(47);
        int int12 = collatzConjecture0.nextNumber(47);
        int int14 = collatzConjecture0.nextNumber(17);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 142 + "'", int12 == 142);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        int int26 = collatzConjecture0.nextNumber((-2));
        int int28 = collatzConjecture0.nextNumber((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
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
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(110);
        int int24 = collatzConjecture0.nextNumber(55);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 166 + "'", int24 == 166);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(364);
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
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 55 + "'", int8 == 55);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        int int32 = collatzConjecture0.nextNumber(142);
        int int34 = collatzConjecture0.nextNumber(206);
        int int36 = collatzConjecture0.nextNumber(40);
        int int38 = collatzConjecture0.nextNumber(350);
        int int40 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 71 + "'", int32 == 71);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 103 + "'", int34 == 103);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20 + "'", int36 == 20);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 175 + "'", int38 == 175);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(20);
        int int16 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(350);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((-2));
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture((int) (byte) 100);
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
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(44);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (short) 100);
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
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
        int int20 = collatzConjecture0.nextNumber(71);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 214 + "'", int20 == 214);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(13);
        int int24 = collatzConjecture0.nextNumber(50);
        int int26 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(146);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(34);
        int int20 = collatzConjecture0.nextNumber(17);
        int int22 = collatzConjecture0.nextNumber(4);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
        java.util.List<java.lang.Integer> intList34 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList36 = collatzConjecture0.collatzConjecture(88);
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
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertNotNull(intList36);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        int int30 = collatzConjecture0.nextNumber(110);
        int int32 = collatzConjecture0.nextNumber(55);
        java.lang.Class<?> wildcardClass33 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 55 + "'", int30 == 55);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 166 + "'", int32 == 166);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
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
        int int26 = collatzConjecture0.nextNumber(10);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(242);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
        int int22 = collatzConjecture0.nextNumber(94);
        int int24 = collatzConjecture0.nextNumber(44);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(274);
        int int28 = collatzConjecture0.nextNumber(80);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 47 + "'", int22 == 47);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 40 + "'", int28 == 40);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(292);
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
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber((-2));
        int int10 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(107);
        int int14 = collatzConjecture0.nextNumber(484);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 242 + "'", int14 == 242);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(5);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 160 + "'", int24 == 160);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        int int14 = collatzConjecture0.nextNumber(125);
        int int16 = collatzConjecture0.nextNumber(100);
        int int18 = collatzConjecture0.nextNumber(188);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(20);
        int int22 = collatzConjecture0.nextNumber(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        int int24 = collatzConjecture0.nextNumber((-2));
        int int26 = collatzConjecture0.nextNumber(38);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        int int16 = collatzConjecture0.nextNumber((int) '#');
        int int18 = collatzConjecture0.nextNumber(0);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(322);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber(250);
        int int18 = collatzConjecture0.nextNumber(19);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 125 + "'", int16 == 125);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
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
        int int20 = collatzConjecture0.nextNumber(10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
        int int22 = collatzConjecture0.nextNumber(182);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 91 + "'", int22 == 91);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(166);
        int int14 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        int int18 = collatzConjecture0.nextNumber(322);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(34);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(484);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 161 + "'", int18 == 161);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        int int12 = collatzConjecture0.nextNumber(1);
        int int14 = collatzConjecture0.nextNumber(55);
        int int16 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
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
        int int22 = collatzConjecture0.nextNumber(350);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(10);
        int int26 = collatzConjecture0.nextNumber(58);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 175 + "'", int22 == 175);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 29 + "'", int26 == 29);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
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
        int int20 = collatzConjecture0.nextNumber(166);
        int int22 = collatzConjecture0.nextNumber(206);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 83 + "'", int20 == 83);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 103 + "'", int22 == 103);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(160);
        int int10 = collatzConjecture0.nextNumber(26);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(250);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(220);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        int int22 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(161);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(88);
        int int14 = collatzConjecture0.nextNumber(146);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 73 + "'", int8 == 73);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 73 + "'", int14 == 73);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int14 = collatzConjecture0.nextNumber(292);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(25);
        int int14 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(80);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(25);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 76 + "'", int12 == 76);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(107);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(364);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(182);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
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
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber(26);
        int int10 = collatzConjecture0.nextNumber(53);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 13 + "'", int8 == 13);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 160 + "'", int10 == 160);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        int int20 = collatzConjecture0.nextNumber(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(88);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(274);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(13);
        int int16 = collatzConjecture0.nextNumber(10);
        int int18 = collatzConjecture0.nextNumber(25);
        int int20 = collatzConjecture0.nextNumber(1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(94);
        java.lang.Class<?> wildcardClass29 = intList28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        int int10 = collatzConjecture0.nextNumber(376);
        int int12 = collatzConjecture0.nextNumber(310);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 188 + "'", int10 == 188);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 155 + "'", int12 == 155);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(160);
        java.lang.Class<?> wildcardClass9 = intList8.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int16 = collatzConjecture0.nextNumber((int) ' ');
        int int18 = collatzConjecture0.nextNumber(13);
        int int20 = collatzConjecture0.nextNumber((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        int int24 = collatzConjecture0.nextNumber(26);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(76);
        int int12 = collatzConjecture0.nextNumber(166);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int16 = collatzConjecture0.nextNumber(34);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(47);
        int int14 = collatzConjecture0.nextNumber(91);
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 274 + "'", int14 == 274);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(166);
        int int26 = collatzConjecture0.nextNumber(53);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 80 + "'", int20 == 80);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 160 + "'", int22 == 160);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 160 + "'", int26 == 160);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        int int34 = collatzConjecture0.nextNumber(161);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 484 + "'", int34 == 484);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        int int14 = collatzConjecture0.nextNumber(10);
        int int16 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(292);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 88 + "'", int16 == 88);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(292);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        int int14 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(106);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) '4');
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        int int20 = collatzConjecture0.nextNumber(310);
        int int22 = collatzConjecture0.nextNumber(5);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 142 + "'", int16 == 142);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 155 + "'", int20 == 155);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(121);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(55);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 364 + "'", int14 == 364);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(10);
        int int14 = collatzConjecture0.nextNumber(700);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((-1));
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 350 + "'", int14 == 350);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        int int14 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '#');
        int int18 = collatzConjecture0.nextNumber((int) ' ');
        int int20 = collatzConjecture0.nextNumber(91);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 274 + "'", int20 == 274);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        int int28 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(11);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(10);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber((int) ' ');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(91);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(188);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(376);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(310);
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
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        int int24 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(53);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber(0);
        int int10 = collatzConjecture0.nextNumber(71);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 214 + "'", int10 == 214);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(25);
        int int18 = collatzConjecture0.nextNumber(20);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(484);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '4');
        int int18 = collatzConjecture0.nextNumber(19);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(80);
        int int12 = collatzConjecture0.nextNumber(38);
        int int14 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(103);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
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
        int int22 = collatzConjecture0.nextNumber(125);
        int int24 = collatzConjecture0.nextNumber(412);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 376 + "'", int22 == 376);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 206 + "'", int24 == 206);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        int int14 = collatzConjecture0.nextNumber(44);
        int int16 = collatzConjecture0.nextNumber((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(8);
        int int18 = collatzConjecture0.nextNumber(2);
        int int20 = collatzConjecture0.nextNumber(73);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 220 + "'", int20 == 220);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int14 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
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
        int int20 = collatzConjecture0.nextNumber(40);
        int int22 = collatzConjecture0.nextNumber((int) (short) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        int int22 = collatzConjecture0.nextNumber((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(13);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        int int22 = collatzConjecture0.nextNumber(107);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(364);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 322 + "'", int22 == 322);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(103);
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
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(47);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 160 + "'", int6 == 160);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(466);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(13);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(38);
        int int30 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList34 = collatzConjecture0.collatzConjecture(44);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList34);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(19);
        java.lang.Class<?> wildcardClass7 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        int int14 = collatzConjecture0.nextNumber(47);
        int int16 = collatzConjecture0.nextNumber(106);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 142 + "'", int14 == 142);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(146);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
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
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
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
        int int28 = collatzConjecture0.nextNumber(44);
        int int30 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList34 = collatzConjecture0.collatzConjecture(166);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 22 + "'", int28 == 22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList34);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(125);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(188);
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
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(88);
        int int14 = collatzConjecture0.nextNumber(26);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(38);
        int int26 = collatzConjecture0.nextNumber(20);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(19);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(220);
        int int6 = collatzConjecture0.nextNumber(8);
        int int8 = collatzConjecture0.nextNumber(250);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 125 + "'", int8 == 125);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
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
        int int20 = collatzConjecture0.nextNumber(50);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 25 + "'", int20 == 25);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(53);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(38);
        int int8 = collatzConjecture0.nextNumber((int) 'a');
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 292 + "'", int8 == 292);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(40);
        int int10 = collatzConjecture0.nextNumber(137);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 412 + "'", int10 == 412);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        int int14 = collatzConjecture0.nextNumber(10);
        int int16 = collatzConjecture0.nextNumber(2);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(125);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(350);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(22);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(292);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(22);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
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
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        int int12 = collatzConjecture0.nextNumber(13);
        int int14 = collatzConjecture0.nextNumber(142);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '4');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(1);
        int int14 = collatzConjecture0.nextNumber((int) '#');
        int int16 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(182);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 106 + "'", int14 == 106);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int18 = collatzConjecture0.nextNumber(412);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber((int) 'a');
        int int14 = collatzConjecture0.nextNumber((int) (short) 10);
        int int16 = collatzConjecture0.nextNumber(25);
        int int18 = collatzConjecture0.nextNumber((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(34);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(125);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(44);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(76);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        int int14 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(466);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(52);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 40 + "'", int14 == 40);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        int int12 = collatzConjecture0.nextNumber(10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(292);
        int int12 = collatzConjecture0.nextNumber((-1));
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber(34);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '#');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(166);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
        int int20 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(110);
        int int10 = collatzConjecture0.nextNumber(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26 + "'", int10 == 26);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(47);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(47);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(161);
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
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) 'a');
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
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        int int30 = collatzConjecture0.nextNumber(55);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 166 + "'", int30 == 166);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber(76);
        int int10 = collatzConjecture0.nextNumber(22);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 38 + "'", int8 == 38);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 142 + "'", int22 == 142);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 250 + "'", int24 == 250);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        int int14 = collatzConjecture0.nextNumber(47);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 142 + "'", int14 == 142);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(20);
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
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(94);
        int int22 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(4);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 146 + "'", int16 == 146);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(182);
        int int20 = collatzConjecture0.nextNumber(175);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 526 + "'", int20 == 526);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(10);
        int int16 = collatzConjecture0.nextNumber(242);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(121);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 121 + "'", int16 == 121);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(100);
        int int16 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(73);
        int int12 = collatzConjecture0.nextNumber((int) (short) 0);
        int int14 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(34);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(40);
        int int16 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
        int int20 = collatzConjecture0.nextNumber(53);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 125 + "'", int18 == 125);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 160 + "'", int20 == 160);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        int int16 = collatzConjecture0.nextNumber(83);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(242);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(88);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 250 + "'", int16 == 250);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
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
        int int22 = collatzConjecture0.nextNumber(38);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(94);
        int int14 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(484);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(11);
        int int18 = collatzConjecture0.nextNumber(214);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 107 + "'", int18 == 107);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        int int16 = collatzConjecture0.nextNumber(83);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(242);
        int int20 = collatzConjecture0.nextNumber(376);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 250 + "'", int16 == 250);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 188 + "'", int20 == 188);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(274);
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(58);
        int int18 = collatzConjecture0.nextNumber((int) (short) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(146);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        int int22 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(29);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(106);
        int int16 = collatzConjecture0.nextNumber(0);
        int int18 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(110);
        int int10 = collatzConjecture0.nextNumber(16);
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 55 + "'", int8 == 55);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(160);
        int int12 = collatzConjecture0.nextNumber(34);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(142);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber(34);
        int int20 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
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
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture((int) ' ');
        int int34 = collatzConjecture0.nextNumber(83);
        java.lang.Class<?> wildcardClass35 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 250 + "'", int34 == 250);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        int int16 = collatzConjecture0.nextNumber((int) '#');
        int int18 = collatzConjecture0.nextNumber(0);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int22 = collatzConjecture0.nextNumber(47);
        int int24 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 142 + "'", int22 == 142);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
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
        int int28 = collatzConjecture0.nextNumber(16);
        int int30 = collatzConjecture0.nextNumber(110);
        int int32 = collatzConjecture0.nextNumber(175);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 55 + "'", int30 == 55);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 526 + "'", int32 == 526);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(110);
        int int10 = collatzConjecture0.nextNumber(110);
        int int12 = collatzConjecture0.nextNumber(161);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(364);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 73 + "'", int6 == 73);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 55 + "'", int10 == 55);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 484 + "'", int12 == 484);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int18 = collatzConjecture0.nextNumber(16);
        int int20 = collatzConjecture0.nextNumber(350);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 175 + "'", int20 == 175);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(142);
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
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(242);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(206);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber((int) 'a');
        int int14 = collatzConjecture0.nextNumber(26);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(10);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(292);
        int int8 = collatzConjecture0.nextNumber(8);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 146 + "'", int6 == 146);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

