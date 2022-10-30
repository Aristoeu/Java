package CollatzConjecture;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(58);
        int int26 = collatzConjecture0.nextNumber(263);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 790 + "'", int26 == 790);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(17);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
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
        int int24 = collatzConjecture0.nextNumber(91);
        int int26 = collatzConjecture0.nextNumber(395);
        int int28 = collatzConjecture0.nextNumber(1336);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 274 + "'", int24 == 274);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1186 + "'", int26 == 1186);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 668 + "'", int28 == 668);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(100);
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
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '#');
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
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
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
        int int24 = collatzConjecture0.nextNumber(250);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 125 + "'", int24 == 125);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(53);
        int int8 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(25);
        int int12 = collatzConjecture0.nextNumber(80);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int16 = collatzConjecture0.nextNumber(71);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 160 + "'", int6 == 160);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 214 + "'", int16 == 214);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
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
        int int24 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(445);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
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
        int int20 = collatzConjecture0.nextNumber(137);
        int int22 = collatzConjecture0.nextNumber(5);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 412 + "'", int20 == 412);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(376);
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
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(91);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(34);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
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
        int int26 = collatzConjecture0.nextNumber(10);
        int int28 = collatzConjecture0.nextNumber(50);
        int int30 = collatzConjecture0.nextNumber(350);
        int int32 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList34 = collatzConjecture0.collatzConjecture(26);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 25 + "'", int28 == 25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 175 + "'", int30 == 175);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 73 + "'", int32 == 73);
        org.junit.Assert.assertNotNull(intList34);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(412);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(107);
        java.lang.Class<?> wildcardClass31 = intList30.getClass();
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
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
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
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int18 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(10);
        int int16 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(146);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(55);
        int int12 = collatzConjecture0.nextNumber(322);
        int int14 = collatzConjecture0.nextNumber(376);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 166 + "'", int10 == 166);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 161 + "'", int12 == 161);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 188 + "'", int14 == 188);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
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
        int int26 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(40);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
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
        int int28 = collatzConjecture0.nextNumber(220);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 110 + "'", int28 == 110);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
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
        int int26 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(58);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(182);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(125);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) '#');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
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
        int int20 = collatzConjecture0.nextNumber(47);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(274);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 83 + "'", int14 == 83);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 142 + "'", int20 == 142);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int10 = collatzConjecture0.nextNumber(4);
        int int12 = collatzConjecture0.nextNumber(71);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 214 + "'", int12 == 214);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(34);
        int int14 = collatzConjecture0.nextNumber(94);
        int int16 = collatzConjecture0.nextNumber(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((-1));
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(58);
        int int16 = collatzConjecture0.nextNumber(0);
        int int18 = collatzConjecture0.nextNumber(40);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(83);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(292);
        int int8 = collatzConjecture0.nextNumber(8);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 146 + "'", int6 == 146);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
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
        int int22 = collatzConjecture0.nextNumber(26);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 13 + "'", int22 == 13);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber((int) ' ');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(38);
        int int14 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(80);
        java.lang.Class<?> wildcardClass17 = intList16.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(106);
        int int16 = collatzConjecture0.nextNumber(206);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 103 + "'", int16 == 103);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
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
        int int20 = collatzConjecture0.nextNumber(263);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(5);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 790 + "'", int20 == 790);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
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
        int int28 = collatzConjecture0.nextNumber(160);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 80 + "'", int28 == 80);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(137);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(34);
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
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(34);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(125);
        int int16 = collatzConjecture0.nextNumber(88);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 44 + "'", int16 == 44);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(40);
        int int16 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(274);
        int int22 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(292);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 55 + "'", int16 == 55);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
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
        int int20 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(50);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
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
        int int24 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(790);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
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
        int int24 = collatzConjecture0.nextNumber(88);
        int int26 = collatzConjecture0.nextNumber(242);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 44 + "'", int24 == 44);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 121 + "'", int26 == 121);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
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
        int int28 = collatzConjecture0.nextNumber(188);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(263);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 94 + "'", int28 == 94);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
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
        int int28 = collatzConjecture0.nextNumber(44);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 22 + "'", int28 == 22);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(5);
        int int12 = collatzConjecture0.nextNumber(250);
        int int14 = collatzConjecture0.nextNumber(26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 125 + "'", int12 == 125);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(38);
        int int14 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(17);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
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
        int int24 = collatzConjecture0.nextNumber(188);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 94 + "'", int24 == 94);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
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
        int int26 = collatzConjecture0.nextNumber(8);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(125);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(16);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(146);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(5);
        int int10 = collatzConjecture0.nextNumber(175);
        int int12 = collatzConjecture0.nextNumber(55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 526 + "'", int10 == 526);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 166 + "'", int12 == 166);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        int int14 = collatzConjecture0.nextNumber(47);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(94);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 142 + "'", int14 == 142);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(274);
        int int18 = collatzConjecture0.nextNumber(106);
        int int20 = collatzConjecture0.nextNumber(188);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 94 + "'", int20 == 94);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
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
        int int24 = collatzConjecture0.nextNumber(47);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(52);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 142 + "'", int24 == 142);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(73);
        int int12 = collatzConjecture0.nextNumber((int) (short) 0);
        int int14 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(161);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
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
        int int26 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(146);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(1336);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
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
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(25);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(44);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int16 = collatzConjecture0.nextNumber(25);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass11 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
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
        int int22 = collatzConjecture0.nextNumber(58);
        int int24 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(160);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(206);
        int int22 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) '#');
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(103);
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
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
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
        int int22 = collatzConjecture0.nextNumber(58);
        int int24 = collatzConjecture0.nextNumber(100);
        int int26 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(52);
        int int14 = collatzConjecture0.nextNumber(593);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1780 + "'", int14 == 1780);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
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
        int int24 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int26 = collatzConjecture0.nextNumber(52);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 26 + "'", int26 == 26);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
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
        int int22 = collatzConjecture0.nextNumber(220);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 110 + "'", int22 == 110);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(166);
        int int30 = collatzConjecture0.nextNumber(71);
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
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 214 + "'", int30 == 214);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
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
        int int20 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(53);
        int int18 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int22 = collatzConjecture0.nextNumber(29);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 160 + "'", int16 == 160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 88 + "'", int22 == 88);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int28 = collatzConjecture0.nextNumber(160);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 80 + "'", int28 == 80);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) 'a');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
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
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
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
        int int20 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(263);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(52);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(166);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(34);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 17 + "'", int14 == 17);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
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
        int int22 = collatzConjecture0.nextNumber(58);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
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
        int int26 = collatzConjecture0.nextNumber(274);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 137 + "'", int26 == 137);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(88);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(274);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(16);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
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
        int int26 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(242);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(25);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture((int) (byte) 100);
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
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(38);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        int int14 = collatzConjecture0.nextNumber(73);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 376 + "'", int18 == 376);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) '4');
        int int26 = collatzConjecture0.nextNumber(107);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(4);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 322 + "'", int26 == 322);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(16);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
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
        int int24 = collatzConjecture0.nextNumber(11);
        int int26 = collatzConjecture0.nextNumber(34);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17 + "'", int26 == 17);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
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
        int int22 = collatzConjecture0.nextNumber(88);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(668);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 44 + "'", int22 == 44);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
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
        int int26 = collatzConjecture0.nextNumber(412);
        java.lang.Class<?> wildcardClass27 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 206 + "'", int26 == 206);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
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
        int int22 = collatzConjecture0.nextNumber(34);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(55);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 17 + "'", int22 == 17);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(125);
        int int22 = collatzConjecture0.nextNumber((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(16);
        int int22 = collatzConjecture0.nextNumber(47);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(110);
        int int26 = collatzConjecture0.nextNumber((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 142 + "'", int22 == 142);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(76);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int24 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 146 + "'", int16 == 146);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(76);
        int int12 = collatzConjecture0.nextNumber(26);
        int int14 = collatzConjecture0.nextNumber(19);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(220);
        int int18 = collatzConjecture0.nextNumber(83);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 250 + "'", int18 == 250);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(310);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(2);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber((int) '4');
        int int18 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(484);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int10 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(188);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(4);
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
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
        int int20 = collatzConjecture0.nextNumber(445);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1336 + "'", int20 == 1336);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int10 = collatzConjecture0.nextNumber(25);
        int int12 = collatzConjecture0.nextNumber(22);
        int int14 = collatzConjecture0.nextNumber(242);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(161);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 76 + "'", int10 == 76);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 121 + "'", int14 == 121);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber(100);
        int int18 = collatzConjecture0.nextNumber(103);
        int int20 = collatzConjecture0.nextNumber(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 310 + "'", int18 == 310);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
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
        int int30 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList34 = collatzConjecture0.collatzConjecture(146);
        int int36 = collatzConjecture0.nextNumber(34);
        java.util.List<java.lang.Integer> intList38 = collatzConjecture0.collatzConjecture(50);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 17 + "'", int36 == 17);
        org.junit.Assert.assertNotNull(intList38);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(242);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(214);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
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
        int int30 = collatzConjecture0.nextNumber((-1));
        int int32 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList34 = collatzConjecture0.collatzConjecture(206);
        java.util.List<java.lang.Integer> intList36 = collatzConjecture0.collatzConjecture(142);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intList34);
        org.junit.Assert.assertNotNull(intList36);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
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
        int int26 = collatzConjecture0.nextNumber((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) '#');
        int int16 = collatzConjecture0.nextNumber(73);
        int int18 = collatzConjecture0.nextNumber(80);
        int int20 = collatzConjecture0.nextNumber(137);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) '#');
        int int24 = collatzConjecture0.nextNumber(526);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 412 + "'", int20 == 412);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 263 + "'", int24 == 263);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
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
        int int20 = collatzConjecture0.nextNumber(106);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53 + "'", int20 == 53);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber((int) 'a');
        int int14 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(125);
        int int18 = collatzConjecture0.nextNumber(91);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292 + "'", int12 == 292);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 274 + "'", int18 == 274);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
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
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
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
        int int24 = collatzConjecture0.nextNumber(10);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(50);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
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
        int int20 = collatzConjecture0.nextNumber(668);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 88 + "'", int16 == 88);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 334 + "'", int20 == 334);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(38);
        int int12 = collatzConjecture0.nextNumber(1);
        int int14 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(121);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 106 + "'", int14 == 106);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
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
        int int28 = collatzConjecture0.nextNumber(11);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture((int) '#');
        int int32 = collatzConjecture0.nextNumber(161);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 34 + "'", int28 == 34);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 484 + "'", int32 == 484);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber(26);
        int int10 = collatzConjecture0.nextNumber(790);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 13 + "'", int8 == 13);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 395 + "'", int10 == 395);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(20);
        int int16 = collatzConjecture0.nextNumber(25);
        int int18 = collatzConjecture0.nextNumber(160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(73);
        int int12 = collatzConjecture0.nextNumber((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
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
        int int24 = collatzConjecture0.nextNumber(376);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 188 + "'", int24 == 188);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(94);
        int int22 = collatzConjecture0.nextNumber(137);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 412 + "'", int22 == 412);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
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
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        int int10 = collatzConjecture0.nextNumber(55);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(100);
        int int14 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(155);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 166 + "'", int10 == 166);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(50);
        int int20 = collatzConjecture0.nextNumber(484);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(76);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 242 + "'", int20 == 242);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(484);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int20 = collatzConjecture0.nextNumber(58);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
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
        int int22 = collatzConjecture0.nextNumber((int) '#');
        int int24 = collatzConjecture0.nextNumber((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 106 + "'", int22 == 106);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
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
        java.lang.Class<?> wildcardClass31 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
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
        int int20 = collatzConjecture0.nextNumber(8);
        int int22 = collatzConjecture0.nextNumber(350);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 175 + "'", int22 == 175);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
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
        int int26 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(322);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2) + "'", int26 == (-2));
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
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
        int int20 = collatzConjecture0.nextNumber(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(58);
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
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(206);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(155);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
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
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber(17);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) '#');
        int int16 = collatzConjecture0.nextNumber(142);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 106 + "'", int14 == 106);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 71 + "'", int16 == 71);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int16 = collatzConjecture0.nextNumber(0);
        int int18 = collatzConjecture0.nextNumber((int) '#');
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 106 + "'", int18 == 106);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(19);
        int int22 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(146);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) '#');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
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
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber(19);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 58 + "'", int24 == 58);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(88);
        int int32 = collatzConjecture0.nextNumber(242);
        java.util.List<java.lang.Integer> intList34 = collatzConjecture0.collatzConjecture(53);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 121 + "'", int32 == 121);
        org.junit.Assert.assertNotNull(intList34);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(107);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(121);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 220 + "'", int10 == 220);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(146);
        int int6 = collatzConjecture0.nextNumber(250);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(166);
        int int10 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(71);
        int int14 = collatzConjecture0.nextNumber(137);
        int int16 = collatzConjecture0.nextNumber(71);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(19);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 125 + "'", int6 == 125);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 412 + "'", int14 == 412);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 214 + "'", int16 == 214);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(19);
        int int18 = collatzConjecture0.nextNumber(364);
        int int20 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int22 = collatzConjecture0.nextNumber(214);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 182 + "'", int18 == 182);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 107 + "'", int22 == 107);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(83);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(80);
        int int16 = collatzConjecture0.nextNumber(13);
        int int18 = collatzConjecture0.nextNumber(73);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(412);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        int int12 = collatzConjecture0.nextNumber(2);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
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
        int int20 = collatzConjecture0.nextNumber(395);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 220 + "'", int18 == 220);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1186 + "'", int20 == 1186);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(106);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
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
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(110);
        int int26 = collatzConjecture0.nextNumber(121);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 364 + "'", int26 == 364);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber((int) ' ');
        int int12 = collatzConjecture0.nextNumber(20);
        int int14 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        int int8 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(5);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
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
        int int26 = collatzConjecture0.nextNumber(484);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 242 + "'", int26 == 242);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(80);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(29);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int10 = collatzConjecture0.nextNumber(25);
        int int12 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(44);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 76 + "'", int10 == 76);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(47);
        int int12 = collatzConjecture0.nextNumber(47);
        int int14 = collatzConjecture0.nextNumber(17);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
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
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
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
        int int26 = collatzConjecture0.nextNumber(88);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 44 + "'", int26 == 44);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(8);
        java.lang.Class<?> wildcardClass15 = intList14.getClass();
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
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(44);
        int int14 = collatzConjecture0.nextNumber(71);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 214 + "'", int14 == 214);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(50);
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
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 80 + "'", int20 == 80);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 47 + "'", int22 == 47);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 10);
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
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(38);
        int int34 = collatzConjecture0.nextNumber(155);
        java.lang.Class<?> wildcardClass35 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 466 + "'", int34 == 466);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(44);
        int int14 = collatzConjecture0.nextNumber(125);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) 'a');
        int int18 = collatzConjecture0.nextNumber(445);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1336 + "'", int18 == 1336);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(88);
        int int16 = collatzConjecture0.nextNumber(376);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 188 + "'", int16 == 188);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
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
        int int28 = collatzConjecture0.nextNumber(146);
        int int30 = collatzConjecture0.nextNumber(274);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 73 + "'", int28 == 73);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 137 + "'", int30 == 137);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(121);
        int int30 = collatzConjecture0.nextNumber(29);
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
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 88 + "'", int30 == 88);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
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
        int int20 = collatzConjecture0.nextNumber(175);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 526 + "'", int20 == 526);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(16);
        int int10 = collatzConjecture0.nextNumber(484);
        int int12 = collatzConjecture0.nextNumber(50);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 242 + "'", int10 == 242);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(310);
        int int32 = collatzConjecture0.nextNumber(53);
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
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 160 + "'", int32 == 160);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(206);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
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
        int int24 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(233);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 73 + "'", int24 == 73);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(11);
        int int28 = collatzConjecture0.nextNumber(250);
        int int30 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 125 + "'", int28 == 125);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
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
        int int26 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(322);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 83 + "'", int22 == 83);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(8);
        int int16 = collatzConjecture0.nextNumber(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(110);
        int int14 = collatzConjecture0.nextNumber(16);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(34);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(26);
        int int26 = collatzConjecture0.nextNumber(322);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(350);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(188);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 161 + "'", int26 == 161);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(8);
        int int16 = collatzConjecture0.nextNumber(376);
        int int18 = collatzConjecture0.nextNumber(376);
        int int20 = collatzConjecture0.nextNumber(80);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 188 + "'", int16 == 188);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 188 + "'", int18 == 188);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(214);
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(40);
        int int16 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 55 + "'", int16 == 55);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
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
        int int20 = collatzConjecture0.nextNumber(83);
        int int22 = collatzConjecture0.nextNumber(142);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(220);
        int int26 = collatzConjecture0.nextNumber(13);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250 + "'", int20 == 250);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 71 + "'", int22 == 71);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 40 + "'", int26 == 40);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(11);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(146);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 88 + "'", int4 == 88);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 73 + "'", int12 == 73);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(2);
        int int10 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
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
        int int24 = collatzConjecture0.nextNumber(22);
        int int26 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 83 + "'", int26 == 83);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int24 = collatzConjecture0.nextNumber(17);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(76);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292 + "'", int20 == 292);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((-1));
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(76);
        int int16 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(484);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(206);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 38 + "'", int14 == 38);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
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
        int int20 = collatzConjecture0.nextNumber(22);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 106 + "'", int14 == 106);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 214 + "'", int18 == 214);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(25);
        int int14 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(166);
        int int18 = collatzConjecture0.nextNumber(161);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(242);
        int int22 = collatzConjecture0.nextNumber(40);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 484 + "'", int18 == 484);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber((-2));
        int int12 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(220);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
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
        int int26 = collatzConjecture0.nextNumber(107);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 322 + "'", int26 == 322);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        int int12 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(22);
        int int16 = collatzConjecture0.nextNumber((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(160);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 125 + "'", int16 == 125);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(11);
        int int24 = collatzConjecture0.nextNumber(34);
        int int26 = collatzConjecture0.nextNumber(44);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 22 + "'", int26 == 22);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(160);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(19);
        int int16 = collatzConjecture0.nextNumber(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(55);
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
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(107);
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
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(121);
        int int26 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(1780);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        int int12 = collatzConjecture0.nextNumber(364);
        int int14 = collatzConjecture0.nextNumber(16);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 182 + "'", int12 == 182);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
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
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
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
        int int28 = collatzConjecture0.nextNumber(526);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 263 + "'", int28 == 263);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int16 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(38);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(107);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(52);
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
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(20);
        int int26 = collatzConjecture0.nextNumber(376);
        int int28 = collatzConjecture0.nextNumber((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 188 + "'", int26 == 188);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(160);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 55 + "'", int20 == 55);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(8);
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
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
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
        int int26 = collatzConjecture0.nextNumber(242);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 121 + "'", int26 == 121);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
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
        int int20 = collatzConjecture0.nextNumber(107);
        int int22 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(52);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 146 + "'", int16 == 146);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 322 + "'", int20 == 322);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber((-2));
        int int12 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(11);
        int int14 = collatzConjecture0.nextNumber(29);
        int int16 = collatzConjecture0.nextNumber(310);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 155 + "'", int16 == 155);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(4);
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
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(5);
        int int10 = collatzConjecture0.nextNumber(10);
        int int12 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(88);
        int int16 = collatzConjecture0.nextNumber(526);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 263 + "'", int16 == 263);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
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
        int int28 = collatzConjecture0.nextNumber(34);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 17 + "'", int28 == 17);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
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
        int int30 = collatzConjecture0.nextNumber(13);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 40 + "'", int30 == 40);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(52);
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
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(146);
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
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
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
        java.util.List<java.lang.Integer> intList36 = collatzConjecture0.collatzConjecture((int) (short) 100);
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
        org.junit.Assert.assertNotNull(intList36);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture((int) 'a');
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
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(53);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(16);
        int int10 = collatzConjecture0.nextNumber(526);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 160 + "'", int6 == 160);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 263 + "'", int10 == 263);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(55);
        int int28 = collatzConjecture0.nextNumber(44);
        int int30 = collatzConjecture0.nextNumber(274);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(700);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 22 + "'", int28 == 22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 137 + "'", int30 == 137);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
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
        int int24 = collatzConjecture0.nextNumber((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
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
        int int20 = collatzConjecture0.nextNumber(0);
        int int22 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(22);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 106 + "'", int14 == 106);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 214 + "'", int18 == 214);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(106);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber(214);
        int int22 = collatzConjecture0.nextNumber(17);
        int int24 = collatzConjecture0.nextNumber((int) '#');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 107 + "'", int20 == 107);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 106 + "'", int24 == 106);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
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
        int int24 = collatzConjecture0.nextNumber(125);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 88 + "'", int16 == 88);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(53);
        int int8 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(155);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 160 + "'", int6 == 160);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
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
        int int20 = collatzConjecture0.nextNumber((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
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
        int int20 = collatzConjecture0.nextNumber(55);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 166 + "'", int20 == 166);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
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
        int int28 = collatzConjecture0.nextNumber(526);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(175);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 263 + "'", int28 == 263);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        int int16 = collatzConjecture0.nextNumber(166);
        int int18 = collatzConjecture0.nextNumber((-1));
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 83 + "'", int16 == 83);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber(22);
        int int12 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(106);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(19);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 58 + "'", int8 == 58);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
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
        int int28 = collatzConjecture0.nextNumber(100);
        int int30 = collatzConjecture0.nextNumber(137);
        java.lang.Class<?> wildcardClass31 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 412 + "'", int30 == 412);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(88);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 80 + "'", int20 == 80);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 182 + "'", int24 == 182);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(220);
        int int28 = collatzConjecture0.nextNumber((int) (short) 100);
        int int30 = collatzConjecture0.nextNumber(107);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 322 + "'", int30 == 322);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 10);
        int int18 = collatzConjecture0.nextNumber(292);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 146 + "'", int18 == 146);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
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
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
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
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
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
        int int20 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(2);
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
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        int int18 = collatzConjecture0.nextNumber(322);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 161 + "'", int18 == 161);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
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
        int int20 = collatzConjecture0.nextNumber(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber(125);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 376 + "'", int16 == 376);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
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
        int int22 = collatzConjecture0.nextNumber(34);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 17 + "'", int22 == 17);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
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
        int int20 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(292);
        int int30 = collatzConjecture0.nextNumber(1780);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 76 + "'", int26 == 76);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 890 + "'", int30 == 890);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(350);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(91);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(142);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(73);
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
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(34);
        int int24 = collatzConjecture0.nextNumber(121);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(214);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 364 + "'", int24 == 364);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
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
        int int24 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(71);
        int int28 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(106);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        int int16 = collatzConjecture0.nextNumber(20);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
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
        int int26 = collatzConjecture0.nextNumber(125);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(100);
        int int32 = collatzConjecture0.nextNumber(142);
        int int34 = collatzConjecture0.nextNumber(52);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 376 + "'", int26 == 376);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 71 + "'", int32 == 71);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 26 + "'", int34 == 26);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(242);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(107);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
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
        int int22 = collatzConjecture0.nextNumber((int) (short) 1);
        int int24 = collatzConjecture0.nextNumber(71);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(91);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 214 + "'", int24 == 214);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(55);
        int int16 = collatzConjecture0.nextNumber(22);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        int int6 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(73);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(44);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 146 + "'", int6 == 146);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(110);
        int int14 = collatzConjecture0.nextNumber(38);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber(1186);
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 55 + "'", int12 == 55);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 593 + "'", int18 == 593);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(412);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(526);
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
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
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
        int int22 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(125);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        int int14 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(38);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(107);
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
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(412);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(83);
        int int12 = collatzConjecture0.nextNumber(52);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(106);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 250 + "'", int10 == 250);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(10);
        int int10 = collatzConjecture0.nextNumber(83);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(53);
        int int14 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 250 + "'", int10 == 250);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
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
        int int24 = collatzConjecture0.nextNumber(5);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(20);
        int int26 = collatzConjecture0.nextNumber(376);
        int int28 = collatzConjecture0.nextNumber((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 188 + "'", int26 == 188);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
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
        int int22 = collatzConjecture0.nextNumber(50);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        int int6 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(73);
        int int10 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(166);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 146 + "'", int6 == 146);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(10);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(34);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
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
        int int20 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(5);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 146 + "'", int16 == 146);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        int int12 = collatzConjecture0.nextNumber(88);
        int int14 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '4');
        int int18 = collatzConjecture0.nextNumber(0);
        int int20 = collatzConjecture0.nextNumber(233);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 700 + "'", int20 == 700);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) 'a');
        int int16 = collatzConjecture0.nextNumber(73);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(19);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(50);
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
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
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
        int int20 = collatzConjecture0.nextNumber(13);
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(22);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 55 + "'", int24 == 55);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
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
        int int28 = collatzConjecture0.nextNumber((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
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
        int int26 = collatzConjecture0.nextNumber(10);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(16);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(11);
        int int12 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '#');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(188);
        int int18 = collatzConjecture0.nextNumber(2);
        int int20 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17 + "'", int26 == 17);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
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
        int int26 = collatzConjecture0.nextNumber((int) '#');
        int int28 = collatzConjecture0.nextNumber(25);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 106 + "'", int26 == 106);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 76 + "'", int28 == 76);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(10);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(94);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int18 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 80 + "'", int22 == 80);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
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
        int int24 = collatzConjecture0.nextNumber(137);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 146 + "'", int14 == 146);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 412 + "'", int24 == 412);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(155);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
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
        int int24 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(166);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(121);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(50);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(292);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int28 = collatzConjecture0.nextNumber(466);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 233 + "'", int28 == 233);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '4');
        int int20 = collatzConjecture0.nextNumber(94);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 47 + "'", int20 == 47);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(11);
        java.lang.Class<?> wildcardClass23 = intList22.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber((-2));
        int int12 = collatzConjecture0.nextNumber((int) (byte) -1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(8);
        int int12 = collatzConjecture0.nextNumber(412);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(146);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 206 + "'", int12 == 206);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
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
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(50);
        int int20 = collatzConjecture0.nextNumber(83);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250 + "'", int20 == 250);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(161);
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
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        int int10 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(250);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(106);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((-2));
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
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(58);
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
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(52);
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(13);
        int int26 = collatzConjecture0.nextNumber(94);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 47 + "'", int26 == 47);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
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
        int int32 = collatzConjecture0.nextNumber(88);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 44 + "'", int32 == 44);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
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
        int int24 = collatzConjecture0.nextNumber(80);
        int int26 = collatzConjecture0.nextNumber((int) '#');
        int int28 = collatzConjecture0.nextNumber(29);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 106 + "'", int26 == 106);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 88 + "'", int28 == 88);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(16);
        int int22 = collatzConjecture0.nextNumber(412);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(11);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 206 + "'", int22 == 206);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
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
        int int24 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(44);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        int int16 = collatzConjecture0.nextNumber(4);
        int int18 = collatzConjecture0.nextNumber(44);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(83);
        int int22 = collatzConjecture0.nextNumber((int) '4');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26 + "'", int22 == 26);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int12 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(161);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(161);
        int int18 = collatzConjecture0.nextNumber(91);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 274 + "'", int18 == 274);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(13);
        int int20 = collatzConjecture0.nextNumber(310);
        int int22 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(103);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 155 + "'", int20 == 155);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 106 + "'", int22 == 106);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        int int18 = collatzConjecture0.nextNumber(0);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 80 + "'", int12 == 80);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
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
        int int28 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
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
        int int24 = collatzConjecture0.nextNumber(376);
        int int26 = collatzConjecture0.nextNumber((int) '4');
        int int28 = collatzConjecture0.nextNumber(76);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 188 + "'", int24 == 188);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 26 + "'", int26 == 26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 38 + "'", int28 == 38);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(80);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(44);
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
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(110);
        int int8 = collatzConjecture0.nextNumber(13);
        int int10 = collatzConjecture0.nextNumber(8);
        int int12 = collatzConjecture0.nextNumber(19);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55 + "'", int6 == 55);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 58 + "'", int12 == 58);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(182);
        int int10 = collatzConjecture0.nextNumber(137);
        int int12 = collatzConjecture0.nextNumber(53);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 73 + "'", int6 == 73);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 412 + "'", int10 == 412);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 160 + "'", int12 == 160);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        int int10 = collatzConjecture0.nextNumber(26);
        int int12 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int14 = collatzConjecture0.nextNumber(73);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 220 + "'", int14 == 220);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
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
        int int22 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(220);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(76);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(484);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
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
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        int int14 = collatzConjecture0.nextNumber(106);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(19);
        int int8 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 55 + "'", int8 == 55);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
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
        int int30 = collatzConjecture0.nextNumber(71);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 376 + "'", int26 == 376);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 214 + "'", int30 == 214);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(125);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 166 + "'", int24 == 166);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
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
        int int22 = collatzConjecture0.nextNumber(890);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 445 + "'", int22 == 445);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(100);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(26);
        int int14 = collatzConjecture0.nextNumber((int) (short) 0);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        int int18 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(376);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(242);
        int int14 = collatzConjecture0.nextNumber(50);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(25);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(52);
        java.lang.Class<?> wildcardClass13 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
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
        int int30 = collatzConjecture0.nextNumber(274);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 137 + "'", int30 == 137);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(80);
        java.lang.Class<?> wildcardClass25 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber((-2));
        int int10 = collatzConjecture0.nextNumber((-2));
        int int12 = collatzConjecture0.nextNumber(445);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1336 + "'", int12 == 1336);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(50);
        int int12 = collatzConjecture0.nextNumber(142);
        int int14 = collatzConjecture0.nextNumber(182);
        int int16 = collatzConjecture0.nextNumber(91);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(364);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 71 + "'", int12 == 71);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 91 + "'", int14 == 91);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 274 + "'", int16 == 274);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(4);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(160);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(292);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture((int) (short) 10);
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
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
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
        int int24 = collatzConjecture0.nextNumber(47);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 142 + "'", int24 == 142);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber(34);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(38);
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
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(263);
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(334);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        int int14 = collatzConjecture0.nextNumber(4);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) ' ');
        int int18 = collatzConjecture0.nextNumber(91);
        int int20 = collatzConjecture0.nextNumber(125);
        int int22 = collatzConjecture0.nextNumber(160);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 274 + "'", int18 == 274);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 376 + "'", int20 == 376);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 80 + "'", int22 == 80);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) '4');
        int int24 = collatzConjecture0.nextNumber(668);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 334 + "'", int24 == 334);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(188);
        int int18 = collatzConjecture0.nextNumber(2);
        int int20 = collatzConjecture0.nextNumber((int) (short) 0);
        int int22 = collatzConjecture0.nextNumber(668);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 334 + "'", int22 == 334);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(146);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 0);
        int int16 = collatzConjecture0.nextNumber(220);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(233);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(13);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 110 + "'", int16 == 110);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(106);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber(214);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(484);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 107 + "'", int20 == 107);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(214);
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
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        int int24 = collatzConjecture0.nextNumber(593);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1780 + "'", int24 == 1780);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(110);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        int int18 = collatzConjecture0.nextNumber(26);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 55 + "'", int14 == 55);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(91);
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
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(25);
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
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
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
        int int28 = collatzConjecture0.nextNumber(100);
        int int30 = collatzConjecture0.nextNumber(137);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(34);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 412 + "'", int30 == 412);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int14 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(106);
        int int20 = collatzConjecture0.nextNumber(52);
        int int22 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(182);
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
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
        int int20 = collatzConjecture0.nextNumber(55);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(484);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 166 + "'", int20 == 166);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(16);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(55);
        int int16 = collatzConjecture0.nextNumber(22);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(160);
        int int20 = collatzConjecture0.nextNumber(146);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 166 + "'", int14 == 166);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 73 + "'", int20 == 73);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(242);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) (short) 1);
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
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(526);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
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
        int int20 = collatzConjecture0.nextNumber(103);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(16);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 310 + "'", int20 == 310);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(206);
        int int22 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) '#');
        java.lang.Class<?> wildcardClass25 = intList24.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(58);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(484);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
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
        int int32 = collatzConjecture0.nextNumber(107);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2) + "'", int22 == (-2));
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 322 + "'", int32 == 322);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(242);
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
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
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
        int int22 = collatzConjecture0.nextNumber(2);
        int int24 = collatzConjecture0.nextNumber(182);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(214);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 91 + "'", int24 == 91);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(80);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(125);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) '4');
        int int18 = collatzConjecture0.nextNumber(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(16);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
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
        int int20 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(91);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 106 + "'", int14 == 106);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 146 + "'", int20 == 146);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) 100);
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
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(106);
        int int16 = collatzConjecture0.nextNumber(0);
        int int18 = collatzConjecture0.nextNumber(8);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(466);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber(58);
        int int10 = collatzConjecture0.nextNumber((int) (byte) 10);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(166);
        int int14 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(10);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(38);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 40 + "'", int20 == 40);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(29);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 26 + "'", int8 == 26);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(83);
        int int14 = collatzConjecture0.nextNumber(83);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 250 + "'", int14 == 250);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(25);
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
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 53 + "'", int22 == 53);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(100);
        int int12 = collatzConjecture0.nextNumber((int) (short) 10);
        int int14 = collatzConjecture0.nextNumber(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(52);
        int int18 = collatzConjecture0.nextNumber(146);
        int int20 = collatzConjecture0.nextNumber(1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 73 + "'", int18 == 73);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(250);
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
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
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
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
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
        java.lang.Class<?> wildcardClass23 = collatzConjecture0.getClass();
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
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(160);
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int16 = collatzConjecture0.nextNumber((int) ' ');
        int int18 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(395);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(47);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be a natural number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 88 + "'", int4 == 88);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int14 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(91);
        int int18 = collatzConjecture0.nextNumber(322);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(790);
        int int22 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 83 + "'", int14 == 83);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 161 + "'", int18 == 161);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber(50);
        int int16 = collatzConjecture0.nextNumber(0);
        int int18 = collatzConjecture0.nextNumber(0);
        int int20 = collatzConjecture0.nextNumber((int) (short) -1);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
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
        int int24 = collatzConjecture0.nextNumber(125);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((-1));
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 376 + "'", int24 == 376);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int8 = collatzConjecture0.nextNumber(100);
        int int10 = collatzConjecture0.nextNumber(83);
        int int12 = collatzConjecture0.nextNumber(52);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(166);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 250 + "'", int10 == 250);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 55 + "'", int22 == 55);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber((int) (short) -1);
        int int14 = collatzConjecture0.nextNumber(142);
        int int16 = collatzConjecture0.nextNumber(88);
        int int18 = collatzConjecture0.nextNumber(80);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 44 + "'", int16 == 44);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(91);
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
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(40);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int18 = collatzConjecture0.nextNumber(10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(25);
        int int24 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
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
        int int26 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int28 = collatzConjecture0.nextNumber(44);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 22 + "'", int28 == 22);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(10);
        int int14 = collatzConjecture0.nextNumber(58);
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
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int6 = collatzConjecture0.nextNumber(88);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(161);
        java.lang.Class<?> wildcardClass9 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 44 + "'", int6 == 44);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(412);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 250 + "'", int20 == 250);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((int) (short) 10);
        int int18 = collatzConjecture0.nextNumber(206);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103 + "'", int18 == 103);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
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
        int int20 = collatzConjecture0.nextNumber(44);
        int int22 = collatzConjecture0.nextNumber(526);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(166);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 263 + "'", int22 == 263);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
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
        int int30 = collatzConjecture0.nextNumber((int) '4');
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26 + "'", int30 == 26);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(5);
        int int10 = collatzConjecture0.nextNumber(10);
        int int12 = collatzConjecture0.nextNumber(100);
        int int14 = collatzConjecture0.nextNumber(10);
        int int16 = collatzConjecture0.nextNumber((int) (short) 0);
        int int18 = collatzConjecture0.nextNumber(274);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 137 + "'", int18 == 137);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(34);
        int int24 = collatzConjecture0.nextNumber(0);
        int int26 = collatzConjecture0.nextNumber((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(146);
        int int6 = collatzConjecture0.nextNumber(250);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(166);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(206);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(188);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 125 + "'", int6 == 125);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(292);
        int int24 = collatzConjecture0.nextNumber(38);
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
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        int int18 = collatzConjecture0.nextNumber(11);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.lang.Class<?> wildcardClass7 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(100);
        int int12 = collatzConjecture0.nextNumber(80);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
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
        int int22 = collatzConjecture0.nextNumber(0);
        int int24 = collatzConjecture0.nextNumber(188);
        int int26 = collatzConjecture0.nextNumber(38);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 94 + "'", int24 == 94);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 19 + "'", int26 == 19);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
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
        int int22 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(137);
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
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) (byte) 1);
        int int12 = collatzConjecture0.nextNumber(0);
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        int int16 = collatzConjecture0.nextNumber((int) (short) -1);
        int int18 = collatzConjecture0.nextNumber(188);
        int int20 = collatzConjecture0.nextNumber(4);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        int int10 = collatzConjecture0.nextNumber(55);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(73);
        int int14 = collatzConjecture0.nextNumber(0);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 166 + "'", int10 == 166);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(29);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(50);
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(263);
        int int26 = collatzConjecture0.nextNumber(10);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(250);
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
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 40 + "'", int22 == 40);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber(53);
        int int16 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 160 + "'", int14 == 160);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292 + "'", int16 == 292);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
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
        int int28 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(364);
        int int32 = collatzConjecture0.nextNumber(0);
        int int34 = collatzConjecture0.nextNumber(55);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 166 + "'", int34 == 166);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber((int) 'a');
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber((int) (short) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(80);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292 + "'", int10 == 292);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(322);
        int int28 = collatzConjecture0.nextNumber((-2));
        int int30 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        int int14 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(52);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 73 + "'", int14 == 73);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        int int12 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(16);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(19);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(55);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        int int12 = collatzConjecture0.nextNumber(29);
        int int14 = collatzConjecture0.nextNumber((int) (short) 10);
        int int16 = collatzConjecture0.nextNumber(364);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(10);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 182 + "'", int16 == 182);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(44);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
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
        int int24 = collatzConjecture0.nextNumber(58);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(593);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
        org.junit.Assert.assertNotNull(intList26);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(88);
        int int8 = collatzConjecture0.nextNumber(376);
        int int10 = collatzConjecture0.nextNumber(4);
        int int12 = collatzConjecture0.nextNumber(188);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 188 + "'", int8 == 188);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 94 + "'", int12 == 94);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
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
        int int30 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(50);
        int int34 = collatzConjecture0.nextNumber(214);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 146 + "'", int30 == 146);
        org.junit.Assert.assertNotNull(intList32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 107 + "'", int34 == 107);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(0);
        int int18 = collatzConjecture0.nextNumber((-2));
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
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
        int int24 = collatzConjecture0.nextNumber((int) (short) -1);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(484);
        java.lang.Class<?> wildcardClass27 = intList26.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(73);
        int int30 = collatzConjecture0.nextNumber((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber((-2));
        int int10 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(175);
        int int16 = collatzConjecture0.nextNumber((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
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
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(137);
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
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
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
        int int20 = collatzConjecture0.nextNumber(26);
        int int22 = collatzConjecture0.nextNumber(322);
        int int24 = collatzConjecture0.nextNumber(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 161 + "'", int22 == 161);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 142 + "'", int24 == 142);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(206);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
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
        int int30 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
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
        int int20 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(146);
        int int24 = collatzConjecture0.nextNumber(2);
        int int26 = collatzConjecture0.nextNumber(11);
        int int28 = collatzConjecture0.nextNumber(242);
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(17);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 106 + "'", int20 == 106);
        org.junit.Assert.assertNotNull(intList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 34 + "'", int26 == 34);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 121 + "'", int28 == 121);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(263);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(160);
        int int32 = collatzConjecture0.nextNumber(445);
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
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(intList30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1336 + "'", int32 == 1336);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
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
        int int24 = collatzConjecture0.nextNumber((int) (short) -1);
        int int26 = collatzConjecture0.nextNumber(142);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 71 + "'", int26 == 71);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
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
        int int20 = collatzConjecture0.nextNumber(214);
        int int22 = collatzConjecture0.nextNumber(53);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 107 + "'", int20 == 107);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 160 + "'", int22 == 160);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
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
        int int22 = collatzConjecture0.nextNumber(22);
        int int24 = collatzConjecture0.nextNumber(233);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 700 + "'", int24 == 700);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        int int2 = collatzConjecture0.nextNumber(1);
        int int4 = collatzConjecture0.nextNumber((-1));
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture(106);
        int int8 = collatzConjecture0.nextNumber((-2));
        int int10 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(175);
        int int16 = collatzConjecture0.nextNumber(76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 38 + "'", int16 == 38);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        int int4 = collatzConjecture0.nextNumber(106);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) '4');
        int int8 = collatzConjecture0.nextNumber((int) (short) 10);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(121);
        int int12 = collatzConjecture0.nextNumber(50);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53 + "'", int4 == 53);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 242 + "'", int22 == 242);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 364 + "'", int24 == 364);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(73);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(175);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(47);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(1);
        java.lang.Class<?> wildcardClass17 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(526);
        int int26 = collatzConjecture0.nextNumber(0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 58 + "'", int22 == 58);
        org.junit.Assert.assertNotNull(intList24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(26);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(100);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(2);
        int int8 = collatzConjecture0.nextNumber(292);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(110);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(4);
        int int14 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(2);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 146 + "'", int8 == 146);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(58);
        int int6 = collatzConjecture0.nextNumber((int) (short) 100);
        int int8 = collatzConjecture0.nextNumber(19);
        int int10 = collatzConjecture0.nextNumber(5);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(76);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 58 + "'", int8 == 58);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
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
        int int26 = collatzConjecture0.nextNumber(214);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(107);
        int int30 = collatzConjecture0.nextNumber(160);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 107 + "'", int26 == 107);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 80 + "'", int30 == 80);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        int int14 = collatzConjecture0.nextNumber((int) ' ');
        int int16 = collatzConjecture0.nextNumber((int) ' ');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(106);
        int int14 = collatzConjecture0.nextNumber((int) (short) 100);
        int int16 = collatzConjecture0.nextNumber(26);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(107);
        int int20 = collatzConjecture0.nextNumber(220);
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 110 + "'", int20 == 110);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(22);
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
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) '#');
        int int30 = collatzConjecture0.nextNumber(322);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 161 + "'", int30 == 161);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(206);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 100);
        int int14 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(376);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(91);
        java.lang.Class<?> wildcardClass19 = intList18.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
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
        int int20 = collatzConjecture0.nextNumber(233);
        int int22 = collatzConjecture0.nextNumber(220);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 376 + "'", int14 == 376);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 700 + "'", int20 == 700);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 110 + "'", int22 == 110);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(13);
        int int10 = collatzConjecture0.nextNumber(146);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(137);
        int int16 = collatzConjecture0.nextNumber(142);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture((int) (byte) 100);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 73 + "'", int10 == 73);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 71 + "'", int16 == 71);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(146);
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
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
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
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(100);
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
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(50);
        int int16 = collatzConjecture0.nextNumber((int) '#');
        int int18 = collatzConjecture0.nextNumber(29);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(53);
        int int22 = collatzConjecture0.nextNumber(100);
        int int24 = collatzConjecture0.nextNumber(593);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 88 + "'", int18 == 88);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1780 + "'", int24 == 1780);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
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
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(53);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 160 + "'", int24 == 160);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
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
        int int24 = collatzConjecture0.nextNumber(11);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(76);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50 + "'", int22 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(350);
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
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) '4');
        int int10 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(71);
        java.lang.Class<?> wildcardClass13 = intList12.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(44);
        int int14 = collatzConjecture0.nextNumber(71);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(484);
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
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(55);
        int int14 = collatzConjecture0.nextNumber(58);
        int int16 = collatzConjecture0.nextNumber(137);
        int int18 = collatzConjecture0.nextNumber(292);
        int int20 = collatzConjecture0.nextNumber(110);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 412 + "'", int16 == 412);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 146 + "'", int18 == 146);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 55 + "'", int20 == 55);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) '#');
        int int10 = collatzConjecture0.nextNumber(16);
        int int12 = collatzConjecture0.nextNumber(166);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(274);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(466);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 106 + "'", int8 == 106);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83 + "'", int12 == 83);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertNotNull(intList16);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(160);
        int int8 = collatzConjecture0.nextNumber(19);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(155);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 80 + "'", int6 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 58 + "'", int8 == 58);
        org.junit.Assert.assertNotNull(intList10);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(100);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (byte) 10);
        int int10 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) (short) 10);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(484);
        int int16 = collatzConjecture0.nextNumber(25);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 80 + "'", int10 == 80);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 76 + "'", int16 == 76);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
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
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(13);
        int int26 = collatzConjecture0.nextNumber(242);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(250);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 121 + "'", int26 == 121);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(1);
        int int16 = collatzConjecture0.nextNumber(484);
        int int18 = collatzConjecture0.nextNumber(88);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 242 + "'", int16 == 242);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        int int14 = collatzConjecture0.nextNumber((int) (byte) 100);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(121);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(76);
        int int10 = collatzConjecture0.nextNumber(50);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(106);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(intList12);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(13);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(38);
        int int16 = collatzConjecture0.nextNumber((-2));
        int int18 = collatzConjecture0.nextNumber(107);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 322 + "'", int18 == 322);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(11);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture(25);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(274);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(71);
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
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) ' ');
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) ' ');
        int int10 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber((int) (short) 10);
        int int16 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int18 = collatzConjecture0.nextNumber(292);
        java.lang.Class<?> wildcardClass19 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 146 + "'", int18 == 146);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
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
        int int24 = collatzConjecture0.nextNumber(73);
        int int26 = collatzConjecture0.nextNumber(76);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 220 + "'", int24 == 220);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 38 + "'", int26 == 38);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
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
        java.lang.Class<?> wildcardClass21 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
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
        int int28 = collatzConjecture0.nextNumber((int) 'a');
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(55);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 292 + "'", int28 == 292);
        org.junit.Assert.assertNotNull(intList30);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber((int) '4');
        int int6 = collatzConjecture0.nextNumber(53);
        int int8 = collatzConjecture0.nextNumber((-2));
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(25);
        int int12 = collatzConjecture0.nextNumber(80);
        java.util.List<java.lang.Integer> intList14 = collatzConjecture0.collatzConjecture((int) (short) 1);
        int int16 = collatzConjecture0.nextNumber((int) ' ');
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(80);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 160 + "'", int6 == 160);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(94);
        java.lang.Class<?> wildcardClass21 = intList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
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
        int int24 = collatzConjecture0.nextNumber(188);
        int int26 = collatzConjecture0.nextNumber((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 94 + "'", int24 == 94);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
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
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(160);
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
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture((int) 'a');
        int int12 = collatzConjecture0.nextNumber(4);
        int int14 = collatzConjecture0.nextNumber(0);
        int int16 = collatzConjecture0.nextNumber(13);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(175);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(intList18);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(2);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) (short) 1);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture((int) (short) 100);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(50);
        java.util.List<java.lang.Integer> intList12 = collatzConjecture0.collatzConjecture(47);
        int int14 = collatzConjecture0.nextNumber(91);
        java.lang.Class<?> wildcardClass15 = collatzConjecture0.getClass();
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertNotNull(intList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 274 + "'", int14 == 274);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        int int6 = collatzConjecture0.nextNumber(4);
        int int8 = collatzConjecture0.nextNumber(13);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
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
        java.util.List<java.lang.Integer> intList30 = collatzConjecture0.collatzConjecture(88);
        java.util.List<java.lang.Integer> intList32 = collatzConjecture0.collatzConjecture(38);
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
        org.junit.Assert.assertNotNull(intList32);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
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
        int int20 = collatzConjecture0.nextNumber(137);
        int int22 = collatzConjecture0.nextNumber(103);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 412 + "'", int20 == 412);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 310 + "'", int22 == 310);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
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
        int int24 = collatzConjecture0.nextNumber(11);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(8);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture(175);
        java.lang.Class<?> wildcardClass29 = collatzConjecture0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture((int) '#');
        int int4 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList6 = collatzConjecture0.collatzConjecture((int) 'a');
        int int8 = collatzConjecture0.nextNumber((int) (short) 1);
        int int10 = collatzConjecture0.nextNumber(5);
        int int12 = collatzConjecture0.nextNumber((int) '4');
        int int14 = collatzConjecture0.nextNumber(160);
        java.util.List<java.lang.Integer> intList16 = collatzConjecture0.collatzConjecture(466);
        java.util.List<java.lang.Integer> intList18 = collatzConjecture0.collatzConjecture(106);
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(13);
        int int22 = collatzConjecture0.nextNumber(103);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 80 + "'", int14 == 80);
        org.junit.Assert.assertNotNull(intList16);
        org.junit.Assert.assertNotNull(intList18);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 310 + "'", int22 == 310);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        com.thealgorithms.maths.CollatzConjecture collatzConjecture0 = new com.thealgorithms.maths.CollatzConjecture();
        java.util.List<java.lang.Integer> intList2 = collatzConjecture0.collatzConjecture(5);
        java.util.List<java.lang.Integer> intList4 = collatzConjecture0.collatzConjecture(50);
        int int6 = collatzConjecture0.nextNumber(0);
        java.util.List<java.lang.Integer> intList8 = collatzConjecture0.collatzConjecture(53);
        java.util.List<java.lang.Integer> intList10 = collatzConjecture0.collatzConjecture(1);
        int int12 = collatzConjecture0.nextNumber(16);
        int int14 = collatzConjecture0.nextNumber(100);
        int int16 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int18 = collatzConjecture0.nextNumber((int) (byte) -1);
        int int20 = collatzConjecture0.nextNumber(25);
        java.util.List<java.lang.Integer> intList22 = collatzConjecture0.collatzConjecture(16);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertNotNull(intList4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intList8);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 76 + "'", int20 == 76);
        org.junit.Assert.assertNotNull(intList22);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
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
        int int20 = collatzConjecture0.nextNumber(146);
        int int22 = collatzConjecture0.nextNumber(55);
        java.util.List<java.lang.Integer> intList24 = collatzConjecture0.collatzConjecture(668);
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 73 + "'", int20 == 73);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 166 + "'", int22 == 166);
        org.junit.Assert.assertNotNull(intList24);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
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
        java.util.List<java.lang.Integer> intList20 = collatzConjecture0.collatzConjecture(76);
        int int22 = collatzConjecture0.nextNumber((int) (byte) 1);
        int int24 = collatzConjecture0.nextNumber(1);
        java.util.List<java.lang.Integer> intList26 = collatzConjecture0.collatzConjecture(220);
        java.util.List<java.lang.Integer> intList28 = collatzConjecture0.collatzConjecture((int) 'a');
        org.junit.Assert.assertNotNull(intList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intList10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 106 + "'", int12 == 106);
        org.junit.Assert.assertNotNull(intList14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertNotNull(intList20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(intList26);
        org.junit.Assert.assertNotNull(intList28);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
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
        java.lang.Class<?> wildcardClass31 = intList30.getClass();
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
}

